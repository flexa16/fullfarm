package by.flex.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "lamps")
public class LampDto {

    private long id;
    private String name;
    private double powerUsage;
    private double brightness;

}
