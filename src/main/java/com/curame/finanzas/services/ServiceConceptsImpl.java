package com.curame.finanzas.services;


import com.curame.finanzas.clients.ConceptClient;
import com.curame.finanzas.models.entity.Concept;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceConceptsImpl implements IServiceConcept{

    private static Logger log = LoggerFactory.getLogger(ServiceConceptsImpl.class);

    @Autowired
    private ConceptClient client;

    @Override
    public List<Concept> getConcepts() {
        log.info("Service get concepts");
        return client.getConcepts();
    }
}
