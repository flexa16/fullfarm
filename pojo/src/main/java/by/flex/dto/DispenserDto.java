package by.flex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DispenserDto {

    private long id;
    private String name;
    private int valvesCount;
    private double powerUsage;
    private double waterUsage;
    private int toValves;

}
