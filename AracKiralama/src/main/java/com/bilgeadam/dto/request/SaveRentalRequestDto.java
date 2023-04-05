package com.bilgeadam.dto.request;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaveRentalRequestDto {

    LocalDate rentDate;
}
