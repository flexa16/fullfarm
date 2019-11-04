package by.flex.repo;

import by.flex.pojoss.devices.Dispenser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DispenserRepository extends MongoRepository< Dispenser, Long > {
    Dispenser findByName(String name);
}
