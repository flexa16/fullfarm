package by.flex.repo;



import by.flex.dto.LampDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LampRepositoryDto extends MongoRepository< LampDto, Long > {
}
