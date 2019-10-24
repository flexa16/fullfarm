package by.flex.repositories.rest;


import by.flex.pojos.rest.devices.Flower;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepositoryRest extends MongoRepository< Flower, Long > {
}
