package com.mahesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahesh.model.feedbackModel;

public interface feedbackRepo extends JpaRepository<feedbackModel,Integer> {

}
