package com.razers.springcloud.service;

import com.razers.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentByID(@Param("id") Long id);

}
