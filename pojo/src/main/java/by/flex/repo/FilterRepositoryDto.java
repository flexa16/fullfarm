package by.flex.repo;


import by.flex.dto.FilterDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilterRepositoryDto extends MongoRepository< FilterDto, Long > {
}
