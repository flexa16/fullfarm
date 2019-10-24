package by.flex.pojoss.devices;

import by.flex.pojoss.sensors.PumpSensors;
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
