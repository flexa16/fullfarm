package by.flex.pojoss.devices;

import by.flex.pojoss.sensors.FlowerSensors;
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
