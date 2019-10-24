package by.flex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FlowerDto {

    private long id;
    private String name;
    private int position;
    private double luxometer;
    private double thermometer;
    private double moistureMeter;
    private double mineralsMeter;

}
