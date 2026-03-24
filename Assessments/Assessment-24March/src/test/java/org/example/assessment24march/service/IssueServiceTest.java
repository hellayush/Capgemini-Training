package org.example.assessment24march.service;



import org.example.assessment24march.dto.IssueRequest;
import org.example.assessment24march.entity.Employee;
import org.example.assessment24march.repository.EmployeeRepository;
import org.example.assessment24march.repository.IssueRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class IssueServiceTest {

    @Autowired
    private IssueService issueService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private IssueRepository issueRepository;

    //  Test 1: Create Issue
    @Test
    void testCreateIssue() {

        Employee emp = new Employee();
        emp.setName("TestUser");
        emp = employeeRepository.save(emp);

        IssueRequest req = new IssueRequest();
        req.setDescription("Test Issue");
        req.setCategory("DESKTOP_ISSUE");
        req.setEmployeeId(emp.getId());

        var response = issueService.createIssue(req);

        assertNotNull(response);
        assertEquals("Test Issue", response.getDescription());
    }

    //  Test 2: Get Unresolved Issues
    @Test
    void testGetUnresolvedIssues() {

        Employee emp = new Employee();
        emp.setName("User2");
        emp = employeeRepository.save(emp);

        IssueRequest req = new IssueRequest();
        req.setDescription("Issue 1");
        req.setCategory("CLOUD_ISSUE");
        req.setEmployeeId(emp.getId());

        issueService.createIssue(req);

        List<?> issues = issueService.getUnresolvedIssues(emp.getId());

        assertFalse(issues.isEmpty());
    }

    //  Test 3: Get Issues This Month
    @Test
    void testGetIssuesThisMonth() {

        Employee emp = new Employee();
        emp.setName("User3");
        emp = employeeRepository.save(emp);

        IssueRequest req = new IssueRequest();
        req.setDescription("Monthly Issue");
        req.setCategory("ACCESS_PERMISSION");
        req.setEmployeeId(emp.getId());

        issueService.createIssue(req);

        var issues = issueService.getIssuesThisMonth();

        assertFalse(issues.isEmpty());
    }

    //  Test 4: Employee Names This Month
    @Test
    void testGetEmployeeNamesThisMonth() {

        Employee emp = new Employee();
        emp.setName("User4");
        emp = employeeRepository.save(emp);

        IssueRequest req = new IssueRequest();
        req.setDescription("Name Test");
        req.setCategory("OTHER");
        req.setEmployeeId(emp.getId());

        issueService.createIssue(req);

        var names = issueService.getEmployeeNamesThisMonth();

        assertTrue(names.contains("User4"));
    }
}
