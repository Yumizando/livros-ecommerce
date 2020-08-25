package br.com.livrosecommerce.service;

import br.com.livrosecommerce.mapper.BookMapper;
import br.com.livrosecommerce.model.dto.BookDTO;
import br.com.livrosecommerce.model.entity.Book;
import br.com.livrosecommerce.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    private final BookMapper bookMapper;

    public BookDTO saveBook(BookDTO dto) {
        Book savedBook = bookRepository.save(bookMapper.dtoToEntity(dto));
        return bookMapper.entityToDTO(savedBook);
    }
}
