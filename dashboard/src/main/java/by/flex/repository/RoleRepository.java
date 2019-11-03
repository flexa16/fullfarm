package by.flex.repository;

import by.flex.pojo.DashRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository< DashRole, Long> {

}
