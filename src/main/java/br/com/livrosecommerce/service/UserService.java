package br.com.livrosecommerce.service;

import br.com.livrosecommerce.mapper.UserLoginMapper;
import br.com.livrosecommerce.model.dto.UserLoginDTO;
import br.com.livrosecommerce.model.entity.UserLogin;
import br.com.livrosecommerce.repository.UserLoginRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import static java.time.LocalDateTime.now;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    private final UserLoginRepository userLoginRepository;

    private final UserLoginMapper userLoginMapper;

    public UserLoginDTO saveUserLogin(UserLoginDTO dto) {
        dto.setRegistrationDate(now());
        dto.setPassword(passwordEncoder.encode(dto.getPassword()));
        UserLogin savedUser = userLoginRepository.save(userLoginMapper.dtoToEntity(dto));
        return userLoginMapper.entityToDTO(savedUser);
    }
}
