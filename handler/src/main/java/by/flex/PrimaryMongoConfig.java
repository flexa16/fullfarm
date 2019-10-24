package by.flex;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "by.flex.repositories.rest",
        mongoTemplateRef = "primaryMongoTemplate")
public class PrimaryMongoConfig {
}
