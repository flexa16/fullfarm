package by.flex.pojos.rest.devices;

import by.flex.pojos.rest.sensors.HeaterSensors;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "heaters")
public class Heater implements Serializable {

    private long id;
    private String name;
    private int status;
    private HeaterSensors sensors;

}
