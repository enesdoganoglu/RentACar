package com.bilgeadam.repository.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tblcar")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer carid;

    private String carname;

    private Integer model_year;

    private Integer daily_price;

    private String description;

    private Integer brandid;

    private Integer colorId;

    private Integer rentId;
    //OneToOne
    private Integer customerid;




}