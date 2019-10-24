package by.flex.repo;

import by.flex.pojoss.devices.Flower;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FlowerRepository extends MongoRepository< Flower, Long > {
}
