package com.rak.teslaprototype.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Cost")
public class Cost {

    @Id
    @Column(name = "car_id")
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "car_id")
    private Car car;

    @Column(name ="currency")
    private String currency;

    @Column(name = "price")
    private Integer price;
}
