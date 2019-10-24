package by.flex.pojos.rest.sensors;


import by.flex.pojos.rest.devices.Heater;
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

}
