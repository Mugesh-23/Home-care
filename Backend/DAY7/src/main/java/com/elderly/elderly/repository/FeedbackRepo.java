package com.elderly.elderly.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elderly.elderly.entity.Feedbackentity;

public interface FeedbackRepo extends JpaRepository<Feedbackentity, Long> {

}
