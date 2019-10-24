package by.flex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PumpDto {

    private long id;
    private String name;
    private String position;
    private boolean powerStatus;
    private double waterUsage;
    private double powerUsage;
}
