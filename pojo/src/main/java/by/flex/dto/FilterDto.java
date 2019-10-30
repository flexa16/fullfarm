package by.flex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "filters")
public class FilterDto {

    private long id;
    private String name;
    private int capacity;
    private int filterHealth;
    private double powerUsage;

}
