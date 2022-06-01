package com.curame.finanzas.services;

import com.curame.finanzas.clients.PaymentClient;
import com.curame.finanzas.models.entity.Concept;
import com.curame.finanzas.models.entity.Pacient;
import com.curame.finanzas.models.entity.Payment;
import com.curame.finanzas.models.entity.PaymentType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServicePaymentImpl implements IServicePayment{

    private static Logger log = LoggerFactory.getLogger(ServicePaymentImpl.class);

    @Autowired
    private PaymentClient client;

    @Override
    public List<Payment> getPayments() {
        log.info("Service get payments");
        return client.getPayments();
    }

    @Override
    public Payment create(Payment payment) {
        log.info("Service create payment");
        return client.create(payment);
    }

    @Override
    public Payment update(Payment payment, Long id) {
        log.info("Service update payment");
        return client.update(payment,id);
    }

    @Override
    public void delete(Long id) {
        log.info("Service delete payment");
        client.delete(id);
    }
}
