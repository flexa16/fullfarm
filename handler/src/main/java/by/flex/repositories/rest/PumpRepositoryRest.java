package by.flex.repositories.rest;


import by.flex.pojos.rest.devices.Pump;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PumpRepositoryRest extends MongoRepository< Pump, Long > {
}
