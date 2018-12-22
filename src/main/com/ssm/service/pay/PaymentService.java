package com.ssm.service.pay;

import com.ssm.pojo.custompojo.Payment;

import java.util.List;

public interface PaymentService {
    List<Payment> findAllPayment();
    void deleteById(Integer id);
    Payment getById(Integer id);
    void insertOnePayment(Payment paymentVo);
    void updateOnePaymentById(Integer id, Payment paymentVo);
}
