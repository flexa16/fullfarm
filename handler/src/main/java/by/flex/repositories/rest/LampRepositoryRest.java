package by.flex.repositories.rest;


import by.flex.pojos.rest.devices.Lamp;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LampRepositoryRest extends MongoRepository< Lamp, Long > {
}
