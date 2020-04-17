package com.ssm.service.pay;

import com.ssm.dao.customdao.PaymentMapper;
import com.ssm.pojo.TbPay;
import com.ssm.pojo.custompojo.Payment;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.util.List;

@Component
public class PaymentServiceImpl implements PaymentService{
    private PaymentMapper paymentMapper;

    public DateFormat getDateFormat() {
        return dateFormat;
    }

    @Inject
    public void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    private DateFormat dateFormat;

    public PaymentMapper getPaymentMapper() {
        return paymentMapper;
    }

    @Inject
    public void setPaymentMapper(PaymentMapper paymentMapper) {
        this.paymentMapper = paymentMapper;
    }

    @Override
    public List<Payment> findAllPayment() {
        List<Payment> paymentList = paymentMapper.queryAllPayment();
        for(Payment payment:paymentList){
            payment.setPaymonth(dateFormat.format(payment.getPayMonth()));
        }
        return paymentList;
    }

    @Override
    public void deleteById(Integer id) {
        paymentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Payment getById(Integer id) {
        TbPay tbPay = paymentMapper.selectByPrimaryKey(id);
        Payment payment = new Payment();

        try {
            BeanUtils.copyProperties(payment,tbPay);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        payment.setPaymonth(dateFormat.format(payment.getPayMonth()));
        return payment;
    }

    @Override
    public void insertOnePayment(Payment paymentVo) {
        paymentMapper.insertSelective(paymentVo);
    }

    @Override
    public void updateOnePaymentById(Integer id, Payment paymentVo) {
        paymentMapper.updateByPrimaryKeySelective(paymentVo);
    }
}
