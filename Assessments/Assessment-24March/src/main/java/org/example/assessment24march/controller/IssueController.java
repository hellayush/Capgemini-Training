package org.example.assessment24march.controller;


import jakarta.websocket.server.PathParam;
import org.example.assessment24march.dto.IssueRequest;
import org.example.assessment24march.dto.IssueResponse;
import org.example.assessment24march.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/issues")
public class IssueController {

    @Autowired
    private IssueService issueService;

    @PostMapping
    public IssueResponse create(@RequestBody IssueRequest dto) {
        return issueService.createIssue(dto);
    }

    @GetMapping("/unresolved/{empId}")
    public List<IssueResponse> getUnresolved(@PathVariable Long empId) {
        return issueService.getUnresolvedIssues(empId);
    }

    @GetMapping("/this-month")
    public List<IssueResponse> getThisMonth() {
        return issueService.getIssuesThisMonth();
    }

    @GetMapping("/employees-this-month")
    public List<String> getEmployees() {
        return issueService.getEmployeeNamesThisMonth();
    }
}
