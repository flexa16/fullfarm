package by.flex.repo;



import by.flex.dto.PumpDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PumpRepositoryDto extends MongoRepository< PumpDto, Long > {
}
