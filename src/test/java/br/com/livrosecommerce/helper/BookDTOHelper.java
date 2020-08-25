package br.com.livrosecommerce.helper;

import br.com.livrosecommerce.model.dto.BookDTO;

import java.math.BigDecimal;

public class BookDTOHelper {

    public static BookDTO getBookDTO(){
        return BookDTO.builder()
                .idBook(1L)
                .bookLanguage("Português")
                .author("Ana Maria")
                .isbn10("4157832512")
                .isbn13("1546878951358")
                .pictureUrl("url")
                .price(new BigDecimal("20.5"))
                .publisher("Editora")
                .title("O Livro")
                .build();

    }
}
