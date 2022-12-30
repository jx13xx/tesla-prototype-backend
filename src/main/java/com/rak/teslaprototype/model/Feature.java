package com.rak.teslaprototype.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Feature")
public class Feature {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String Feature;
    private Integer Price;
}
