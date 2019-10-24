package by.flex.list.services;

import by.flex.pojo.AppRole;
import by.flex.pojo.AppUser;
import by.flex.pojo.RoleName;
import by.flex.repositories.AppRoleRepository;
import by.flex.repositories.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;
import java.util.logging.Logger;

@Service
public class UserService {

    private static Logger log = Logger.getLogger(UserService.class.getName());

    @Autowired
    AppUserRepository userRepository;

    @Autowired
    AppRoleRepository roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public boolean saveUser(AppUser user) {
        if (user == null || user.getFirstName().isEmpty() ||
                user.getLastName().isEmpty() ||
                user.getEmail().isEmpty()
                || user.getPassword().isEmpty()) {
            return false;
        }
        AppRole userRole = roleRepository.findByRoleName(RoleName.USER);
        if (userRole == null) {
            userRole = new AppRole();
            userRole.setRoleName(RoleName.USER);
        }
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        log.info("Encoded password - " + encodedPassword);
        user.setPassword(encodedPassword);
        user.setAppRoles(Set.of(userRole));
        userRepository.save(user);
        return true;
    }


}
