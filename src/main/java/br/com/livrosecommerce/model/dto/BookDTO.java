package br.com.livrosecommerce.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
