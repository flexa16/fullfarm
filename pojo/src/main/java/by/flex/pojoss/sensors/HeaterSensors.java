package by.flex.pojoss.sensors;

import by.flex.pojoss.devices.Heater;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class HeaterSensors implements Serializable {

    private double powerUsage;
    private int funSpeed;
    private double temperature;
    private Heater heater;

    public HeaterSensors(double powerUsage, int funSpeed, double temperature) {
        this.powerUsage = powerUsage;
        this.funSpeed = funSpeed;
        this.temperature = temperature;
    }
}
