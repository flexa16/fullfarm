package by.flex.pojos.rest.devices;


import by.flex.pojos.rest.sensors.FlowerSensors;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "flowers")
public class Flower implements Serializable {
    private long id;
    private String name;
    private int position;
    private FlowerSensors sensors;
}
