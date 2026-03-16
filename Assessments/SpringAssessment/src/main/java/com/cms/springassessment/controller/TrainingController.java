package com.cms.springassessment.controller;

import com.cms.springassessment.model.Training;
import com.cms.springassessment.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/trainings")
public class TrainingController {

    @Autowired
    private TrainingRepository repo;

    @GetMapping()
    public List<Training> getTrainings(@RequestParam(required = false) String name) {

        LocalDate today = LocalDate.now();

        List<Training> trainings;

        if (name == null) {
            trainings = repo.findAll();
        } else {
            trainings = repo.findByTopicContainingIgnoreCase(name);
        }

        return trainings.stream()
                .filter(t -> !t.getEndDate().isBefore(today))
                .toList();
    }

    @GetMapping("/upcoming")
    public List<Training> getUpcomingTrainings(@RequestParam(required=false) String name){

        LocalDate today = LocalDate.now();

        List<Training> trainings;

        if(name == null){
            trainings = repo.findAll();
        } else{
            trainings = repo.findByTopicContainingIgnoreCase(name);
        }

        return trainings.stream()
                .filter(t -> t.getStartDate().isAfter(today))
                .toList();
    }
}
