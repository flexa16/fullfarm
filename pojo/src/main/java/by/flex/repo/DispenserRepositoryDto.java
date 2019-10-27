package by.flex.repo;



import by.flex.dto.DispenserDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispenserRepositoryDto extends MongoRepository< DispenserDto, Long > {

}
