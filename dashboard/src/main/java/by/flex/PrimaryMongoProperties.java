package by.flex;

import lombok.Data;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "mongodb")
public class PrimaryMongoProperties {

    private MongoProperties primary = new MongoProperties();
}
