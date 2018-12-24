package com.ssm.controller.pay;

import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.ssm.pojo.custompojo.Payment;
import com.ssm.service.pay.PaymentService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/payment/rest")
public class PayControllerREST {
    private ObjectMapper jsonMapper;
    private PaymentService paymentService;

    public PaymentService getPaymentService() {
        return paymentService;
    }

    @Inject
    public void setPaymentService(@Named("paymentServiceImpl") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public ObjectMapper getJsonMapper() {
        return jsonMapper;
    }

    @Inject
    public void setJsonMapper(ObjectMapper jsonMapper) {
        this.jsonMapper = jsonMapper;
    }

    @RequestMapping(value = "/queryAll", produces = "application/json;charset=UTF-8")
    public ObjectNode queryAll(){
        ObjectNode result = jsonMapper.createObjectNode();
        ArrayNode arrayNode = null;

        List<Payment> list = paymentService.findAllPayment();

        try {
            arrayNode = (ArrayNode) jsonMapper.readTree(
                    jsonMapper.writerWithView(Payment.Views.QueryView.class).writeValueAsString(list));
        } catch (IOException e) {
            e.printStackTrace();
        }

        result.put("Title","All Payment Information");
        result.putArray("data").addAll(arrayNode);
        return result;
    }

    @RequestMapping("/delete")
    public void deleteOne(@RequestParam("id") Integer id){
        paymentService.deleteById(id);
    }

    @RequestMapping(value = "/getbyid/{id}",produces = "application/json;charset=UTF-8")
    @JsonView(Payment.Views.QueryView.class)
    public Payment getById(@PathVariable("id") Integer id){
        return paymentService.getById(id);
    }

    @RequestMapping("/addsubmission")
    public void addSubmission(Payment paymentVo){
        Integer id = paymentVo.getId();
        if(id == null){
            paymentService.insertOnePayment(paymentVo);
        }else{
            paymentService.updateOnePaymentById(id, paymentVo);
        }
    }
}
