package by.flex.pojos.dash;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "lamps")
public class LampDto {

    private long id;
    private String name;
    private double powerUsage;
    private double brightness;

}
