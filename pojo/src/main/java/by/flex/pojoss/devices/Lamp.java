package by.flex.pojoss.devices;

import by.flex.pojoss.sensors.LampSensors;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "lamps")
public class Lamp implements Serializable {

    private long id;
    private String name;
    private LampSensors sensors;
}
