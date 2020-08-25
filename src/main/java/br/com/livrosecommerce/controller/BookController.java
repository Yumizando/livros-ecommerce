package br.com.livrosecommerce.controller;

import br.com.livrosecommerce.mapper.BookMapper;
import br.com.livrosecommerce.model.dto.BookDTO;
import br.com.livrosecommerce.model.response.BookResponse;
import br.com.livrosecommerce.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/livros")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    private final BookMapper bookMapper;

    @PreAuthorize("hasAnyAuthority('ADMIN')")
    @PostMapping("/cadastro")
    public ResponseEntity<BookResponse> postBook(@RequestBody BookDTO bookRequest){
        BookDTO bookDTO = bookService.saveBook(bookRequest);
        BookResponse bookResponse = bookMapper.dtoToResponse(bookDTO);
        return ResponseEntity.created(
                URI.create("/livros/".concat(bookResponse.getIdBook().toString()))
        ).body(bookResponse);
    }

}
