package com.curame.finanzas.controllers;

import com.curame.finanzas.models.entity.Concept;
import com.curame.finanzas.services.ServiceConceptsImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/v1/api")
public class ConceptController {

    private static Logger log = LoggerFactory.getLogger(ConceptController.class);

    @Autowired
    private ServiceConceptsImpl service;

    @GetMapping("/concepts")
    public List<Concept> getConcepts(){
        log.info("Controller get concepts");
        return service.getConcepts();
    }
}
