package by.flex.pojos.dash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "filters")
public class FilterDto {

    private long id;
    private String name;
    private int capacity;
    private int filterHealth;
    private double powerUsage;


}
