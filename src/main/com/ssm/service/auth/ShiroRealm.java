package com.ssm.service.auth;

import com.ssm.pojo.custompojo.Manager;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;

import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class ShiroRealm extends AuthorizingRealm {
    private LoginCheck loginCheckImpl;

    public LoginCheck getLoginCheckImpl() {
        return loginCheckImpl;
    }

    @Inject
    public void setLoginCheckImpl(LoginCheck loginCheckImpl) {
        this.loginCheckImpl = loginCheckImpl;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        String password = new String((char[])token.getCredentials());

        Manager user = loginCheckImpl.findManagerByName(username);
        if(user == null){
            throw new UnknownAccountException();
        }

        if(username!=null && !password.equals("")){
            return new SimpleAuthenticationInfo(user,user.getPassword(),getName());
        }else{
            return null;
        }
    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pc) {
        Manager user=(Manager) pc.getPrimaryPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        if(user!=null) {
                return info;
            }
        return null;
    }
}
