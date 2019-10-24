package by.flex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HeaterDto {

    private long id;
    private String name;
    private int position;
    private double powerUsage;
    private int funSpeed;
    private double temperature;

}
