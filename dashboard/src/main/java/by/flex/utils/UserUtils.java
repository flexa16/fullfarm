package by.flex.utils;

import by.flex.pojo.Role;
import by.flex.pojo.User;
import by.flex.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;


@Component
public class UserUtils {

    @Autowired
    UserRepository userRepository;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public void registerNewUser(String email, String password){
        Set< Role > set = new HashSet<>();
        set.add(new Role("USER"));
        User user = new User();
        user.setId(0);
        user.setEmail(email);
        user.setPassword(bCryptPasswordEncoder.encode(password));
        user.setRoles(set);
            userRepository.save(user);
    }

    public boolean checkExistUser(String email){
        User user = userRepository.findByEmail(email);
        return email.equals(user.getEmail());
    }

    public boolean validateUser(String email,String password){
        User user = userRepository.findByEmail(email);
        boolean userCheck = email.equals(user.getPassword());
        boolean pswdCheck = password.equals(bCryptPasswordEncoder.encode(user.getPassword()));
            return userCheck || pswdCheck;
    }

}
