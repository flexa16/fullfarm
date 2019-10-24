package by.flex.repositories.dash;


import by.flex.pojos.dash.HeaterDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeaterRepositoryDash extends MongoRepository< HeaterDto, Long > {
}
