package com.bilgeadam.repository.entity;

import jakarta.persistence.*;
import lombok.*;

;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tblbrandcar")
public class BrandCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer id;

    Integer brandid;

    Integer carid;
}