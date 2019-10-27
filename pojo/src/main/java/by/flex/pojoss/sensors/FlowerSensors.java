package by.flex.pojoss.sensors;

import by.flex.pojoss.devices.Flower;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
public class FlowerSensors implements Serializable {

    private double luxometer;
    private double thermometer;
    private double moistureMeter;
    private double mineralsMeter;

    public FlowerSensors(double luxometer, double thermometer, double moistureMeter, double mineralsMeter) {
        this.luxometer = luxometer;
        this.thermometer = thermometer;
        this.moistureMeter = moistureMeter;
        this.mineralsMeter = mineralsMeter;
    }
}
