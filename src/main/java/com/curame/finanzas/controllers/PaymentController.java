package com.curame.finanzas.controllers;

import com.curame.finanzas.models.entity.Payment;
import com.curame.finanzas.services.ServicePaymentImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class PaymentController {

    private static Logger log = LoggerFactory.getLogger(PaymentController.class);

    @Autowired
    private ServicePaymentImpl service;

    @RequestMapping("/payments")
    public List<Payment> getPayments() {
        log.info("Controller get payments");
        return service.getPayments();
    }

    @PostMapping("/payments")
    @ResponseStatus(HttpStatus.CREATED)
    public Payment create(@RequestBody Payment payment) {
        log.info("Controller create payment");
        return service.create(payment);
    }

    @PutMapping("/payments/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Payment update(@RequestBody Payment payment, @PathVariable Long id) {
        log.info("Controller update payment");
        return service.update(payment,id);
    }

    @DeleteMapping("/payments/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(Long id) {
        log.info("Controller delete payment");
        service.delete(id);
    }
}
