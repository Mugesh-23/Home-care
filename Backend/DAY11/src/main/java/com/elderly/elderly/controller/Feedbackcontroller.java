package com.elderly.elderly.controller;

import com.elderly.elderly.dto.Feedbackdto;
import com.elderly.elderly.service.Feedbackservice;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/feedback")
public class Feedbackcontroller {

    private final Feedbackservice feedbackservice;

    public Feedbackcontroller(Feedbackservice feedbackservice) {
        this.feedbackservice = feedbackservice;
    }
    @Tag(name="Get Feedback",description="Get Feedback endpoint")
    @GetMapping
    public ResponseEntity<List<Feedbackdto>> getAllFeedbacks() {
        List<Feedbackdto> feedbacks = feedbackservice.getAllFeedbacks();
        return new ResponseEntity<>(feedbacks, HttpStatus.OK);
    }
    @Tag(name="Post Feedback",description="Post Feedback endpoint")

    @PostMapping
    public ResponseEntity<Feedbackdto> createFeedback(@RequestBody Feedbackdto feedbackDto) {
        Feedbackdto createdFeedback = feedbackservice.createFeedback(feedbackDto);
        return new ResponseEntity<>(createdFeedback, HttpStatus.CREATED);
    }
}
