package by.flex.repo;



import by.flex.dto.HeaterDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeaterRepositoryDto extends MongoRepository< HeaterDto, Long > {
}
