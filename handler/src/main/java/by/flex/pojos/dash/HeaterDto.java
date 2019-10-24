package by.flex.pojos.dash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "heaters")
public class HeaterDto {

    private long id;
    private String name;
    private int position;
    private double powerUsage;
    private int funSpeed;
    private double temperature;


}
