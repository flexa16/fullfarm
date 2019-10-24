package by.flex.repositories.rest;


import by.flex.pojos.rest.devices.Filter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilterRepositoryRest extends MongoRepository< Filter, Long > {
}
