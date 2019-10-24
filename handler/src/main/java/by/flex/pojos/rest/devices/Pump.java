package by.flex.pojos.rest.devices;

import by.flex.pojos.rest.sensors.PumpSensors;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "pumps")
public class Pump implements Serializable {

    private long id;
    private String name;
    private String position;
    private PumpSensors sensors;


}
