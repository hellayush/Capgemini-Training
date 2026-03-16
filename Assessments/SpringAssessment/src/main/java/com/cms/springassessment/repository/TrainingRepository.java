package com.cms.springassessment.repository;

import com.cms.springassessment.model.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TrainingRepository extends JpaRepository<Training, Long> {

    List<Training> findByTopicContainingIgnoreCase(String name);


}