package by.flex.pojos.rest.devices;


import by.flex.pojos.rest.sensors.DispenserSensors;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "dispensers")
public class Dispenser implements Serializable {

    private long id;
    private String name;
    private int valvesCount;
    private DispenserSensors sensors;

}
