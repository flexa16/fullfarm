package by.flex.pojoss.sensors;

import by.flex.pojoss.devices.Lamp;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class LampSensors implements Serializable {

    private double powerUsage;
    private double brightness;

    public LampSensors(double powerUsage, double brightness) {
        this.powerUsage = powerUsage;
        this.brightness = brightness;
    }
}
