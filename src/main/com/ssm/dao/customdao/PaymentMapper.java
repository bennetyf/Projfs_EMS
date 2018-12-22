package com.ssm.dao.customdao;

import com.ssm.dao.TbPayMapper;
import com.ssm.pojo.custompojo.Payment;

import java.util.List;

public interface PaymentMapper extends TbPayMapper {
    List<Payment> queryAllPayment();
}
