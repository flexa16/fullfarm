package by.flex.pojos.rest.sensors;


import by.flex.pojos.rest.devices.Flower;
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
    private Flower sensor;

}
