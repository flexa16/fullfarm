package by.flex.repository;

import by.flex.pojo.DashUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository< DashUser, Long> {
    DashUser findByEmail(String email);
}
