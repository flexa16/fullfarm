package by.flex.repositories.dash;


import by.flex.pojos.dash.LampDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LampRepositoryDash extends MongoRepository< LampDto, Long > {
}
