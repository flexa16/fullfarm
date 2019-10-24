package by.flex.repositories.rest;


import by.flex.pojos.rest.devices.Heater;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeaterRepositoryRest extends MongoRepository< Heater, Long > {
}
