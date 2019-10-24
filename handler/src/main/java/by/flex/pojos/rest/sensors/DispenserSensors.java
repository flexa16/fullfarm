package by.flex.pojos.rest.sensors;


import by.flex.pojos.rest.devices.Dispenser;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
public class DispenserSensors implements Serializable {

    private double powerUsage;
    private double waterUsage;
    private int toValves;
    private Dispenser dispenser;

}
