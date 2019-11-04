package by.flex.pojoss.devices;

import by.flex.pojoss.sensors.DispenserSensors;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "dispensers")
public class Dispenser implements Serializable {

    private long id;
    private String name;
    private int valvesCount;
    private DispenserSensors sensors;

}
