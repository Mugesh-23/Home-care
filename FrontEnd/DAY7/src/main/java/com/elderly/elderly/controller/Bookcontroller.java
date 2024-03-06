package com.elderly.elderly.controller;

import com.elderly.elderly.dto.Bookdto;
import com.elderly.elderly.service.Bookservice;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class Bookcontroller {

    private final Bookservice bookService;

    public Bookcontroller(Bookservice bookService) {
        this.bookService = bookService;
    }
    @Tag(name="Get Booking",description="Get Booking endpoint")
    @GetMapping
    public ResponseEntity<List<Bookdto>> getAllBooks() {
        List<Bookdto> books = bookService.getAllBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
    @Tag(name="Get Booking By Username",description="Get Booking By Username endpoint")
    @GetMapping("/{username}")
    public ResponseEntity<Bookdto> getBookByUsername(@PathVariable String username) {
        Bookdto book = bookService.getBookByUsername(username);
        return book != null
                ? new ResponseEntity<>(book, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @Tag(name="Post Booking",description="Post Booking endpoint")
    @PostMapping
    public ResponseEntity<Bookdto> createBook(@RequestBody Bookdto bookDto) {
        Bookdto createdBook = bookService.createBook(bookDto);
        return new ResponseEntity<>(createdBook, HttpStatus.CREATED);
    }

    @Tag(name="Delete Booking By Username",description="Delete Booking By Username endpoint")
    @DeleteMapping("/{username}")
    public ResponseEntity<Void> deleteBookByUsername(@PathVariable String username) {
        bookService.deleteBookByUsername(username);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @Tag(name="Update Booking By Username",description="Update Booking By Username endpoint")
    @PutMapping("/{username}")
    public ResponseEntity<Bookdto> updateBookByUsername(
            @PathVariable String username,
            @RequestBody Bookdto updatedBookDto
    ) {
        Bookdto updatedBook = bookService.updateBookByUsername(username, updatedBookDto);
        return updatedBook != null
                ? new ResponseEntity<>(updatedBook, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
