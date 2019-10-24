package by.flex.repositories.rest;


import by.flex.pojos.rest.devices.Dispenser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispenserRepositoryRest extends MongoRepository< Dispenser, Long > {
}
