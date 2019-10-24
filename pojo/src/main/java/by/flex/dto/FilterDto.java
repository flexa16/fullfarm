package by.flex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FilterDto {

    private long id;
    private String name;
    private int capacity;
    private int filterHealth;
    private double powerUsage;

}
