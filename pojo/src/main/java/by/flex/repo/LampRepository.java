package by.flex.repo;

import by.flex.pojoss.devices.Lamp;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LampRepository extends MongoRepository< Lamp, Long > {
}
