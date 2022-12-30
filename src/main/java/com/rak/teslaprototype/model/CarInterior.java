package com.rak.teslaprototype.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CarInterior")
public class CarInterior {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "interior_id")
    private Long interio_id;


    private String description;
    private Boolean option_included;
    private String price;
    private String spec_value;
}
