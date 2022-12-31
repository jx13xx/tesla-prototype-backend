package com.rak.teslaprototype.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Meta")
public class Meta {

    @Id
    @Column(name ="car_id")
    private Long id;

    @Column(name = "imageUrl")
    private String imageUrl;

    @Column(name = "bannerColor")
    private String bannerColor;
}
