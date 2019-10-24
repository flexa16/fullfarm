package by.flex.repositories.dash;


import by.flex.pojos.dash.DispenserDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispenserRepositoryDash extends MongoRepository< DispenserDto, Long > {

}
