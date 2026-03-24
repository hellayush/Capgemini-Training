package org.example.assessment24march.mapper;

import org.example.assessment24march.dto.IssueRequest;
import org.example.assessment24march.dto.IssueResponse;
import org.example.assessment24march.entity.Employee;
import org.example.assessment24march.entity.Issue;
import org.example.assessment24march.enums.IssueCategory;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class IssueMapper {

    public Issue toEntity(IssueRequest dto, Employee employee) {
        Issue issue = new Issue();
        issue.setDescription(dto.getDescription());
        issue.setCategory(IssueCategory.valueOf(dto.getCategory()));
        issue.setResolved(false);
        issue.setCreatedDate(LocalDate.now());
        issue.setEmployee(employee);
        return issue;
    }

    public IssueResponse toDTO(Issue issue) {
        return new IssueResponse(
                issue.getId(),
                issue.getDescription(),
                issue.getCategory().name(),
                issue.isResolved(),
                issue.getEmployee().getName()
        );
    }
}
