package by.flex.pojoss.sensors;

import by.flex.pojoss.devices.Pump;
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

    public PumpSensors(boolean powerStatus, double waterUsage, double powerUsage) {
        this.powerStatus = powerStatus;
        this.waterUsage = waterUsage;
        this.powerUsage = powerUsage;
    }
}
