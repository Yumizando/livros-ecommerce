package br.com.livrosecommerce.helper;

import br.com.livrosecommerce.mapper.BookMapper;
import br.com.livrosecommerce.model.dto.BookDTO;
import br.com.livrosecommerce.model.entity.Book;

public class BookHelper {

    public static Book getBook(BookDTO dto) {
        return Book.builder()
                .idBook(dto.getIdBook())
                .author(dto.getAuthor())
                .bookLanguage(dto.getBookLanguage())
                .isbn10(dto.getIsbn10())
                .isbn13(dto.getIsbn13())
                .pictureUrl(dto.getPictureUrl())
                .price(dto.getPrice())
                .publisher(dto.getPublisher())
                .title(dto.getTitle())
                .build();
    }
}
