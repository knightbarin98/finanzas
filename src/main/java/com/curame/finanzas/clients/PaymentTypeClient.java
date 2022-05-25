package com.curame.finanzas.clients;

import com.curame.finanzas.models.entity.PaymentType;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="servicio-pagos")
public interface PaymentTypeClient{

    @GetMapping("/payment-types")
    public List<PaymentType> getPaymentTypes();
}
