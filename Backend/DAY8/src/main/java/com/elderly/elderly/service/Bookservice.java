package com.elderly.elderly.service;

import com.elderly.elderly.dto.Bookdto;
import com.elderly.elderly.entity.Bookentity;
import com.elderly.elderly.mapper.Bookmapper;
import com.elderly.elderly.repository.BookRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional; // Import transactional annotation

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Bookservice {

    private final BookRepo bookRepo;

    public Bookservice(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public List<Bookdto> getAllBooks() {
        List<Bookentity> books = bookRepo.findAll();
        return books.stream()
                .map(Bookmapper::mapToBookingDto)
                .collect(Collectors.toList());
    }

    public Bookdto getBookByUsername(String username) {
        return bookRepo.findByUsername(username)
                .map(Bookmapper::mapToBookingDto)
                .orElse(null);
    }

    @SuppressWarnings("null")
    public Bookdto createBook(Bookdto bookDto) {
        Bookentity bookEntity = Bookmapper.mapToBookEntity(bookDto);
        bookEntity = bookRepo.save(bookEntity);
        return Bookmapper.mapToBookingDto(bookEntity);
    }

    @Transactional // Add @Transactional annotation
    public void deleteBookByUsername(String username) {
        bookRepo.deleteByUsername(username);
    }

    public Bookdto updateBookByUsername(String username, Bookdto updatedBookDto) {
        return bookRepo.findByUsername(username)
                .map(existingBook -> {
                    // Update the fields you want to allow updating
                    existingBook.setAge(updatedBookDto.getAge());
                    existingBook.setEmail(updatedBookDto.getEmail());
                    existingBook.setMobile(updatedBookDto.getMobile());
                    existingBook.setServicename(updatedBookDto.getServiceName());
                    existingBook.setPaymentmethod(updatedBookDto.getPaymentMethod());

                    existingBook = bookRepo.save(existingBook);
                    return Bookmapper.mapToBookingDto(existingBook);
                })
                .orElse(null);
    }
}
