package by.flex.pojos.rest.sensors;


import by.flex.pojos.rest.devices.Filter;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class FilterSensors implements Serializable {

    private int capacity;
    private int filterHealth;
    private double powerUsage;
    private Filter filter;

}
