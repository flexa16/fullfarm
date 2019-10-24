package by.flex;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "by.flex.repositories.dash",
        mongoTemplateRef = "secondaryMongoTemplate")
public class SecondaryMongoConfig {
}
