package by.flex.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LampDto {

    private long id;
    private String name;
    private double powerUsage;
    private double brightness;

}
