package com.curame.finanzas.services;

import com.curame.finanzas.models.entity.PaymentType;

import java.util.List;

public interface IServicePaymentType {

    public List<PaymentType> getPaymentTypes();
}
