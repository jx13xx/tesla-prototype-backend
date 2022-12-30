package com.rak.teslaprototype.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Color")
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name ="colorName")
    private String colorName;

    @Column(name = "colorValue")
    private String colorValue;

    @Column(name ="price")
    private String price;

    @Column(name = "baseColor")
    private Boolean baseColor;


}
