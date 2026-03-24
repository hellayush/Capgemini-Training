package org.example.assessment24march.service;


import org.example.assessment24march.dto.IssueRequest;
import org.example.assessment24march.dto.IssueResponse;

import java.util.List;

public interface IssueService {

    IssueResponse createIssue(IssueRequest dto);

    List<IssueResponse> getUnresolvedIssues(Long empId);

    List<IssueResponse> getIssuesThisMonth();

    List<String> getEmployeeNamesThisMonth();
}
