package com.agendador.usuario.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address")

public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Street")
    private String street;
    @Column(name = "number")
    private Long number;
    @Column(name = "complement", length = 10)
    private String complement;
    @Column(name = "city", length = 150)
    private String city;
    @Column(name = "state", length = 2)
    private String state;
    @Column(name = "zipcode", length = 9)
    private String zipcode;

}
