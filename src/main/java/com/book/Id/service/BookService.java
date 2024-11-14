package com.book.Id.service;

import com.book.Id.Exception.ResourceNotFoundException;
import com.book.Id.entity.Book;
import com.book.Id.payload.BookDto;
import com.book.Id.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private BookRepository bookRepository;

    private final ModelMapper getModelMapper;
    public BookService(BookRepository bookRepository, ModelMapper modelMapper) {
        this.bookRepository = bookRepository;
        this.getModelMapper=modelMapper;
    }


    public BookDto insertDetails(BookDto dto){

        Book b1=mapToEntity(dto);
        Book saveDetals = bookRepository.save(b1);

        return mapToDto(saveDetals);
    }

    public Book updateDetails(Book book,Long id){

        book.setId(id);
        return bookRepository.save(book);
    }


    public void deleteById(Long id){
         bookRepository.deleteById(id);
    }



    public List<Book> getAllBooks(Book book) {

return bookRepository.findAll();
    }

    public BookDto getByIdDetails(Long id) {
        Book book = bookRepository.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("Not Found Exception "+id));

        BookDto dto = mapToDto(book);
    return dto;
    }


    //Convert to   Entity to Dto

    public Book mapToEntity(BookDto dto){
        return getModelMapper.map(dto, Book.class);

    }

    //Convert Dto To Entity
    public
    BookDto mapToDto(Book book){
        return getModelMapper.map(book,BookDto.class);
    }




}
