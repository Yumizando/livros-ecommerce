package br.com.livrosecommerce.mapper;

import br.com.livrosecommerce.model.dto.BookDTO;
import br.com.livrosecommerce.model.entity.Book;
import br.com.livrosecommerce.model.response.BookResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {

    Book dtoToEntity(BookDTO dto);

    BookDTO entityToDTO(Book book);

    BookResponse dtoToResponse(BookDTO dto);
}
