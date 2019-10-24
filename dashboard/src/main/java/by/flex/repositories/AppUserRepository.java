package by.flex.repositories;

import by.flex.pojo.AppUser;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AppUserRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(AppUser appUser) {
        sessionFactory.getCurrentSession().save(appUser);
    }

    public AppUser findByUserEmail(String email) {
        return sessionFactory.getCurrentSession().
                createQuery("from AppUser where email like :param1", AppUser.class).
                setParameter("param1", email).getSingleResult();
    }
}
