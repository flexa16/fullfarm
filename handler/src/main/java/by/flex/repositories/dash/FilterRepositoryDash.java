package by.flex.repositories.dash;


import by.flex.pojos.dash.FilterDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilterRepositoryDash extends MongoRepository< FilterDto, Long > {
}
