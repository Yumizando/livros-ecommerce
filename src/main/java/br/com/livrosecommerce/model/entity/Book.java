package br.com.livrosecommerce.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity
@Table(name = "BOOK")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_BOOK", insertable = false, updatable = false)
    private Long idBook;

    @Column(name = "BOOK_LANGUAGE")
    private String bookLanguage;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "ISBN_10")
    private String isbn10;

    @Column(name = "ISBN_13")
    private String isbn13;

    @Column(name = "PUBLISHER")
    private String publisher;

    @Column(name = "PICTURE_URL")
    private String pictureUrl;
}
