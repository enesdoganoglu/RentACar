package com.bilgeadam.dto.request;
import javax.persistence.ElementCollection;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaveColorRequestDto {

     String colorName;


}
