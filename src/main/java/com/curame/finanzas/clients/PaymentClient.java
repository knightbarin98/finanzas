package com.curame.finanzas.clients;

import com.curame.finanzas.models.entity.Payment;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient(name = "servicio-pagos")
public interface PaymentClient {

    @GetMapping("/payments")
    public List<Payment> getPayments();

    @PostMapping("/payments")
    public Payment create(@RequestBody Payment payment);

    @PutMapping("/payments/{id}")
    public Payment update(@RequestBody Payment payment, @PathVariable Long id);

    @DeleteMapping("/payments/{id}")
    public void delete(@PathVariable Long id);
}
