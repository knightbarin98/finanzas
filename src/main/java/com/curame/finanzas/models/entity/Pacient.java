package com.curame.finanzas.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Pacient {

    private Long id;
    private String firstname;
    private String lastname;
    private String address;
    private String neighborhood;
    private Integer zipCode;

}
