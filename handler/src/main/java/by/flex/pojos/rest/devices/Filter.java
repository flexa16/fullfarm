package by.flex.pojos.rest.devices;


import by.flex.pojos.rest.sensors.FilterSensors;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "filters")
public class Filter implements Serializable {

    private long id;
    private String name;
    private FilterSensors sensors;

}
