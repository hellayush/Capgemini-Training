package org.example.assessment24march.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.assessment24march.enums.IssueCategory;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Issue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Enumerated(EnumType.STRING)
    private IssueCategory category;

    private boolean resolved;

    private LocalDate createdDate;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}

