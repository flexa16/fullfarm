package by.flex.repositories.dash;


import by.flex.pojos.dash.PumpDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PumpRepositoryDash extends MongoRepository< PumpDto, Long > {
}
