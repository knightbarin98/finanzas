package com.curame.finanzas.services;

import com.curame.finanzas.clients.PaymentTypeClient;
import com.curame.finanzas.models.entity.PaymentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicePaymentTypeImpl implements IServicePaymentType{

    private static Logger log = LoggerFactory.getLogger(ServicePaymentTypeImpl.class);

    @Autowired
    private PaymentTypeClient client;

    @Override
    public List<PaymentType> getPaymentTypes() {
        log.info("Service get payments");
        return client.getPaymentTypes();
    }
}
