package co.develhope.FirstAPI05.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Setter @Getter @AllArgsConstructor @NoArgsConstructor
public class CarDTO {

    @NotBlank(message = "mandatory")
    private String id;
    @NotBlank(message = "mandatory")
    private String modelName;

    private double price;
}
