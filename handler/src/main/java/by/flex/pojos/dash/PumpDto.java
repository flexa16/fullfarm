package by.flex.pojos.dash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "pumps")
public class PumpDto {

    private long id;
    private String name;
    private String position;
    private boolean powerStatus;
    private double waterUsage;
    private double powerUsage;
}
