package org.example.assessment24march.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class IssueResponse {
    private Long id;
    private String description;
    private String category;
    private boolean resolved;
    private String employeeName;
}
