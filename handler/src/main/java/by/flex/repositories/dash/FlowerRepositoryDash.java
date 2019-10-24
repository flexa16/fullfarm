package by.flex.repositories.dash;


import by.flex.pojos.dash.FlowerDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepositoryDash extends MongoRepository< FlowerDto, Long > {
}
