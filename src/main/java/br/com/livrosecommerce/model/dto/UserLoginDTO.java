package br.com.livrosecommerce.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginDTO {

    private Long idUser;

    private ProfileDTO profile;

    private Boolean active;

    private String email;

    private String password;

    private LocalDateTime registrationDate;
}
