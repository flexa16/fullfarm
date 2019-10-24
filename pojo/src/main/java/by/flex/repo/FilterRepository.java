package by.flex.repo;

import by.flex.pojoss.devices.Filter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FilterRepository extends MongoRepository< Filter, Long > {
}
