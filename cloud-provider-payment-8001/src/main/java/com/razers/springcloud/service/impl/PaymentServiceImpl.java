package com.razers.springcloud.service.impl;

import com.razers.springcloud.dao.PaymentDao;
import com.razers.springcloud.entities.Payment;
import com.razers.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentByID(@Param("id") Long id) {
        return paymentDao.getPaymentByID(id);
    }
}
