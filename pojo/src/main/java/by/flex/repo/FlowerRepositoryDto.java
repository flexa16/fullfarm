package by.flex.repo;



import by.flex.dto.FlowerDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepositoryDto extends MongoRepository< FlowerDto, Long > {
}
