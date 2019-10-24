package by.flex.pojoss.sensors;


import by.flex.pojoss.devices.Dispenser;
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

    public DispenserSensors(double powerUsage, double waterUsage, int toValves) {
        this.powerUsage = powerUsage;
        this.waterUsage = waterUsage;
        this.toValves = toValves;
    }


}
