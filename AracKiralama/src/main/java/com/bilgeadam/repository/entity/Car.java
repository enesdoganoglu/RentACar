package com.bilgeadam.repository.entity;


import javax.persistence.*;
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
    private Integer carId;

    private String carName;

    private Integer modelYear;

    private Integer dailyPrice;

    private String description;

    private Integer brandId;

    private Integer colorId;

    private Integer rentId;
    //OneToOne
    private Integer customerId;




}