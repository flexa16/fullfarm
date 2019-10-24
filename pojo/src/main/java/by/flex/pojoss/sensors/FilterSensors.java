package by.flex.pojoss.sensors;

import by.flex.pojoss.devices.Filter;
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

    public FilterSensors(int capacity, int filterHealth, double powerUsage) {
        this.capacity = capacity;
        this.filterHealth = filterHealth;
        this.powerUsage = powerUsage;
    }
}
