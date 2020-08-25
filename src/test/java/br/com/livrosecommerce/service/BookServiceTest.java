package br.com.livrosecommerce.service;

import br.com.livrosecommerce.helper.BookHelper;
import br.com.livrosecommerce.mapper.BookMapper;
import br.com.livrosecommerce.model.dto.BookDTO;
import br.com.livrosecommerce.model.entity.Book;
import br.com.livrosecommerce.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static br.com.livrosecommerce.helper.BookDTOHelper.getBookDTO;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @InjectMocks
    private BookService bookService;

    @Mock
    private BookRepository bookRepository;

    @Mock
    private BookMapper bookMapper;

    private BookDTO bookDTO;

    private Book book;

    @BeforeEach
    public void setup(){
        bookDTO = getBookDTO();

        book = BookHelper.getBook(bookDTO);
    }

    @Test
    public void shouldSaveBook(){
        when(bookRepository.save(any())).thenReturn(book);
        when(bookMapper.entityToDTO(any())).thenReturn(bookDTO);

        BookDTO dto = bookService.saveBook(bookDTO);

        assertNotNull(dto, "should not be null.");
    }
}
