package by.flex.security;


import by.flex.pojo.DashUser;
import by.flex.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.stream.Collectors;

@Service
public class AuthenticationService implements UserDetailsService {

    @Autowired
    UserRepository repository;

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        DashUser dashUser = repository.findByEmail(email);
        if (dashUser == null) {
            throw new UsernameNotFoundException("User not found");
        }
        System.out.println(dashUser.getDashRoles());
        User user = new User(dashUser.getEmail(),
                dashUser.getPassword(),
                dashUser.getDashRoles().stream()
                        .map(dashRole -> new SimpleGrantedAuthority(dashRole.getRole()))
                        .collect(Collectors.toSet())
        );
        return user;
    }
}
