package com.book.Id.controller;

import com.book.Id.entity.Book;
import com.book.Id.payload.BookDto;
import com.book.Id.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.modelmapper.ModelMapper;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {


    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("/books")
    public BookDto insertBook(@RequestBody BookDto dto){

        BookDto bookDto = bookService.insertDetails(dto);
        return bookDto;
    }


    @PutMapping("/books/{id}")

    public ResponseEntity<Book> updateBook(@RequestBody Book book, @PathVariable Long id){
        Book b1=bookService.updateDetails(book,id);
return new ResponseEntity<>(b1, HttpStatus.OK);

    }

    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable Long id){

        bookService.deleteById(id);
        return "Book delete successfully";
    }


    @GetMapping("/books")
    public List<Book> getAllBooks(Book book){
        return bookService.getAllBooks(book);
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<BookDto> getByIdDetails(@PathVariable Long id){
        BookDto stu = bookService.getByIdDetails(id);


        return new ResponseEntity<>(stu,HttpStatus.OK);
    }


}
