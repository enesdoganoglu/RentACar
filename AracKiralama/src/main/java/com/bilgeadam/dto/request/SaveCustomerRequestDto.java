package com.bilgeadam.dto.request;
import javax.persistence.ElementCollection;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaveCustomerRequestDto {
     String custemerName;
     String companyName;

}
