package com.curame.finanzas.clients;

import com.curame.finanzas.models.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
