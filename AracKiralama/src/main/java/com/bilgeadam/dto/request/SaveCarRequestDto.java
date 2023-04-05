package com.bilgeadam.dto.request;

import lombok.*;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaveCarRequestDto {

    String carName;

    Integer modelYear;

    Integer dailyPrice;

    String description;

    Integer brandId;
    
    Integer colorId;

    Integer rentId;
    //OneToOne
    Integer customerId;


}
