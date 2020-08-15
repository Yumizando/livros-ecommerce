package br.com.livrosecommerce.mapper;

import br.com.livrosecommerce.model.dto.UserLoginDTO;
import br.com.livrosecommerce.model.entity.UserLogin;
import br.com.livrosecommerce.model.request.UserLoginRequest;
import br.com.livrosecommerce.model.response.UserLoginResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserLoginMapper {

    @Mapping(target = "idUser", ignore = true)
    @Mapping(target = "registrationDate", ignore = true)
    @Mapping(target = "profile.idProfile", source = "idProfile")
    UserLoginDTO requestToDTO(UserLoginRequest request);

    UserLoginResponse dtoToResponse(UserLoginDTO dto);

    UserLogin dtoToEntity(UserLoginDTO dto);

    UserLoginDTO entityToDTO(UserLogin user);
}
