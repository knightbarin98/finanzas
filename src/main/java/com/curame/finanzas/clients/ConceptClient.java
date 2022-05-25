package com.curame.finanzas.clients;

import com.curame.finanzas.models.entity.Concept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "servicio-pagos")
public interface ConceptClient {

    @GetMapping("/concepts")
    public List<Concept> getConcepts();
}
