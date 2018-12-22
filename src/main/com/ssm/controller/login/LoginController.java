package com.ssm.controller.login;

import com.ssm.service.auth.LoginCheck;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.json.JSONObject;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/login")
public class LoginController {
    private LoginCheck loginCheckImpl;

    public LoginCheck getLoginCheckImpl() {
        return loginCheckImpl;
    }

    @Inject
    public void setLoginCheckImpl(LoginCheck loginCheckImpl) {
        this.loginCheckImpl = loginCheckImpl;
    }


    @RequestMapping(value = "",produces = "text/html;charset=UTF-8")
    public String toLogin(){
        return "Login/Login";
    }

    @RequestMapping(value = "/success", produces = "text/html;charset=UTF-8")
    public String toLoginSuccess(){
        return "Login/Success";
    }

    @RequestMapping(value = "/logincheck",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String loginCheck(HttpServletRequest req){
        JSONObject obj = new JSONObject() ;
        String errInfo ="";
        String username = req.getParameter("login_uname");
        String password = req.getParameter("login_pwd");

        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();

        if(!session.getAttributeKeys().contains(username)){
//        String passwordsha = new SimpleHash("SHA-1",username,password).toString();
            try {
                UsernamePasswordToken token = new UsernamePasswordToken(username, password);
                subject.login(token);
            } catch (UnknownAccountException ue) {
                errInfo = "No Such User";
            } catch (IncorrectCredentialsException ie) {
                errInfo = "Wrong Password";
            } catch (AuthenticationException ae) {
                errInfo = "Unknown Status";
            }
            if(errInfo.length()==0){
                errInfo="Login Success";
                session.setAttribute(username,username);
            }
        }else{
            errInfo="Login Success";
        }
        obj.put("result",errInfo);
        return obj.toString();
    }
}
