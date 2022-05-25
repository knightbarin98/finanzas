package com.curame.finanzas.services;

import com.curame.finanzas.models.entity.Payment;

import java.util.List;

public interface IServicePayment {

    public List<Payment> getPayments();
    public Payment create(Payment payment);
    public Payment update(Payment payment, Long id);
    public void delete(Long id);
}
