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
    private Long id;


    private String description;
    private String color;
    private Boolean option_included;
    private Integer price;

}
