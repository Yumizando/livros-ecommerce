package br.com.livrosecommerce.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserLoginDTO {

    private Long idUser;

    private ProfileDTO profile;

    private Boolean active;

    private String email;

    private String password;

    private LocalDateTime registrationDate;
}
