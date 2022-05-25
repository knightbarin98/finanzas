package com.curame.finanzas.controllers;

import com.curame.finanzas.models.entity.PaymentType;
import com.curame.finanzas.services.ServicePaymentTypeImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class PaymentTypeController {

    private static Logger log = LoggerFactory.getLogger(PaymentTypeController.class);

    @Autowired
    private ServicePaymentTypeImpl service;

    @GetMapping("/payment-types")
    public List<PaymentType> getPaymentTypes(){
        return service.getPaymentTypes();
    }
}
