package by.flex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "pumps")
public class PumpDto {

    private long id;
    private String name;
    private String position;
    private boolean powerStatus;
    private double waterUsage;
    private double powerUsage;
}
