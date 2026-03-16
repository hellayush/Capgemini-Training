package com.cms.springassessment.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="training")
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trainingid;

    private String topic;

    private LocalDate start_date;

    private LocalDate end_date;

    private String trainer_name;

    private String venue;



    public Long getTrainingid() {
        return trainingid;
    }

    public void setTrainingid(Long trainingid) {
        this.trainingid = trainingid;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public LocalDate getStartDate() {
        return start_date;
    }

    public void setStartDate(LocalDate startDate) {
        this.start_date = start_date;
    }

    public LocalDate getEndDate() {
        return end_date;
    }

    public void setEndDate(LocalDate endDate) {
        this.end_date = end_date;
    }

    public String getTrainername() {
        return trainer_name;
    }

    public void setTrainername(String trainername) {
        this.trainer_name = trainername;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
}
