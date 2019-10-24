package by.flex.pojos.rest.sensors;


import by.flex.pojos.rest.devices.Pump;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class PumpSensors implements Serializable {

    private boolean powerStatus;
    private double waterUsage;
    private double powerUsage;
    private Pump pump;

}
