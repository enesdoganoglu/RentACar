package com.bilgeadam.dto.request;
import jakarta.persistence.ElementCollection;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaveCustomerRequestDto {
     String name;
     String company_name;

}
