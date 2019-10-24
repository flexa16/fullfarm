package by.flex.repo;

import by.flex.pojoss.devices.Pump;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PumpRepository extends MongoRepository< Pump, Long > {
}
