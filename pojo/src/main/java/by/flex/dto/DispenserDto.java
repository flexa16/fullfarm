package by.flex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "dispensers")
public class DispenserDto {

    private long id;
    private String name;
    private int valvesCount;
    private double powerUsage;
    private double waterUsage;
    private int toValves;

}
