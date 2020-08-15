package br.com.livrosecommerce.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginRequest {

    private Long idProfile;

    private Boolean active;

    private String email;

    private String password;
}
