package by.flex.service;

import by.flex.pojo.DashRole;
import by.flex.pojo.DashUser;
import by.flex.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;


@Component
public class UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    BCryptPasswordEncoder passwordEncoder;


    public void registerNewUser(DashUser user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        Set<DashRole> roles = new HashSet<>();
        if (user.isAdmin()){
            roles.add(new DashRole("ADMIN"));
            roles.add(new DashRole("USER"));
            user.setDashRoles(roles);
        } else {
            roles.add(new DashRole("USER"));
            user.setDashRoles(roles);
        }
        userRepository.save(user);
    }


    public DashUser findUserByEmail(String email){
        return userRepository.findByEmail(email);
    }

}
