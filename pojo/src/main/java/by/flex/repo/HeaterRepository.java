package by.flex.repo;

import by.flex.pojoss.devices.Heater;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HeaterRepository extends MongoRepository< Heater, Long > {
}
