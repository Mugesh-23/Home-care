package com.elderly.elderly.mapper;

import com.elderly.elderly.dto.Feedbackdto;
import com.elderly.elderly.entity.Feedbackentity;

public class Feedbackmapper {

    public static Feedbackdto mapToFeedbackDto(Feedbackentity feedbackEntity) {
        // Implement the mapping logic
        return new Feedbackdto(
                feedbackEntity.getId(),
                feedbackEntity.getUsername(),
                feedbackEntity.getQuery()
        );
    }

    public static Feedbackentity mapToFeedbackEntity(Feedbackdto feedbackDto) {
        // Implement the mapping logic
        return new Feedbackentity(
                feedbackDto.getId(),
                feedbackDto.getUsername(),
                feedbackDto.getQuery()
        );
    }
}
