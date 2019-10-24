package by.flex.pojos.rest.sensors;


import by.flex.pojos.rest.devices.Lamp;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class LampSensors implements Serializable {

    private double powerUsage;
    private double brightness;
    private Lamp lamp;
}
