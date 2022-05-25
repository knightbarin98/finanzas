package com.curame.finanzas.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Payment {


    private Long id;
    private Double subtotal;
    private Double total;
    private String rfc;
    private Boolean voice;
    private Concept concept;
    private PaymentType paymentType;
    private Pacient pacient;

}
