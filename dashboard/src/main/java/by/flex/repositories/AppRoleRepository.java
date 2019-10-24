package by.flex.repositories;

import by.flex.pojo.AppRole;
import by.flex.pojo.RoleName;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AppRoleRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(AppRole appRole) {
        sessionFactory.getCurrentSession().save(appRole);
    }

    public AppRole findByRoleName(RoleName roleName) {
        return sessionFactory.getCurrentSession().
                createQuery("from AppRole where roleName like :param1", AppRole.class).
                setParameter("param1", roleName).
                getSingleResult();
    }
}
