package by.flex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "heaters")
public class HeaterDto {

    private long id;
    private String name;
    private int position;
    private double powerUsage;
    private int funSpeed;
    private double temperature;

}
