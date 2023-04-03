package com.bilgeadam.dto.request;
import jakarta.persistence.ElementCollection;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaveCarRequestDto {

    String carname;

    Integer model_year;

    Integer daily_price;

    String description;

    Integer brandid;
    
    Integer colorId;

    Integer rentId;
    //OneToOne
    Integer customerid;


}
