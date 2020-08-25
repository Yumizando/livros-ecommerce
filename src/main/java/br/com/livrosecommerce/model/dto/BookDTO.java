package br.com.livrosecommerce.model.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BookDTO {

    private Long idBook;

    private String bookLanguage;

    private String author;

    private String title;

    private BigDecimal price;

    private String isbn10;

    private String isbn13;

    private String publisher;

    private String pictureUrl;
}
