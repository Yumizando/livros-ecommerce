package br.com.livrosecommerce.controller;

import br.com.livrosecommerce.mapper.UserLoginMapper;
import br.com.livrosecommerce.model.dto.UserLoginDTO;
import br.com.livrosecommerce.model.request.UserLoginRequest;
import br.com.livrosecommerce.model.response.UserLoginResponse;
import br.com.livrosecommerce.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    private final UserLoginMapper userLoginMapper;

    @PostMapping("/cadastro")
    public ResponseEntity<UserLoginResponse> postUserLogin(@RequestBody UserLoginRequest request){
        UserLoginDTO userLoginDTO = userLoginMapper.requestToDTO(request);
        UserLoginDTO savedUserLogin = userService.saveUserLogin(userLoginDTO);
        UserLoginResponse userLoginResponse = userLoginMapper.dtoToResponse(savedUserLogin);
        return ResponseEntity.created(URI.create("/users".concat(userLoginResponse.getIdUser().toString())))
                .body(userLoginResponse);
    }
}
