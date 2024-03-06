package com.elderly.elderly.service;


import com.elderly.elderly.dto.Feedbackdto;
import com.elderly.elderly.entity.Feedbackentity;
import com.elderly.elderly.mapper.Feedbackmapper;
import com.elderly.elderly.repository.FeedbackRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Feedbackservice {

    private final FeedbackRepo feedbackRepo;

    public Feedbackservice(FeedbackRepo feedbackRepo) {
        this.feedbackRepo = feedbackRepo;
    }

    public List<Feedbackdto> getAllFeedbacks() {
        List<Feedbackentity> feedbacks = feedbackRepo.findAll();
        return feedbacks.stream()
                .map(Feedbackmapper::mapToFeedbackDto)
                .collect(Collectors.toList());
    }

    @SuppressWarnings("null")
    public Feedbackdto createFeedback(Feedbackdto feedbackDto) {
        Feedbackentity feedbackEntity = Feedbackmapper.mapToFeedbackEntity(feedbackDto);
        feedbackEntity = feedbackRepo.save(feedbackEntity);
        return Feedbackmapper.mapToFeedbackDto(feedbackEntity);
    }
}
