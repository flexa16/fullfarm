package by.flex.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "flowers")
public class FlowerDto {

    private long id;
    private String name;
    private int position;
    private double luxometer;
    private double thermometer;
    private double moistureMeter;
    private double mineralsMeter;

}
