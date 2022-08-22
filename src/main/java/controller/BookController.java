package controller;

import dto.MessageResponseDTO;
import entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.BookRepository;

@RestController
@RequestMapping("api/v1/books")
public class BookController {
    private BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book){
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder().message("Livro criado com o Id: " + savedBook.getId()).build();
    }
}
