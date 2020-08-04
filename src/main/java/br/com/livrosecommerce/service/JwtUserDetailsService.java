package br.com.livrosecommerce.service;

import br.com.livrosecommerce.model.Role;
import br.com.livrosecommerce.model.entity.UserLogin;
import br.com.livrosecommerce.repository.UserLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Value("${jwt.secret}")
    private String secret;

    @Autowired
    private UserLoginRepository userLoginRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserLogin userLogin = userLoginRepository.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));

        return new User(userLogin.getEmail(), userLogin.getPassword(), Collections.singletonList(new Role(userLogin.getProfile().getDescription())));
    }
}