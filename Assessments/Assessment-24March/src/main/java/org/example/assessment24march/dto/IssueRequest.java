package org.example.assessment24march.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IssueRequest {
    private String description;
    private String category;
    private Long employeeId;
}
