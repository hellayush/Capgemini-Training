package org.example.assessment24march.service.impl;


import org.example.assessment24march.mapper.IssueMapper;
import org.example.assessment24march.dto.IssueRequest;
import org.example.assessment24march.dto.IssueResponse;
import org.example.assessment24march.entity.Employee;
import org.example.assessment24march.entity.Issue;
import org.example.assessment24march.exceptions.ResourceNotFoundException;
import org.example.assessment24march.repository.EmployeeRepository;
import org.example.assessment24march.repository.IssueRepository;
import org.example.assessment24march.service.IssueService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class IssueServiceImpl implements IssueService {

    private static final Logger log = LoggerFactory.getLogger(IssueServiceImpl.class);

    @Autowired
    private IssueRepository issueRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private IssueMapper mapper;

    @Override
    public IssueResponse createIssue(IssueRequest dto) {

        log.info("Creating issue for employee {}", dto.getEmployeeId());

        Employee emp = employeeRepository.findById(dto.getEmployeeId())
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found"));

        Issue issue = mapper.toEntity(dto, emp);

        return mapper.toDTO(issueRepository.save(issue));
    }

    @Override
    public List<IssueResponse> getUnresolvedIssues(Long empId) {
        log.info("Fetching unresolved issues for {}", empId);

        return issueRepository.findByEmployeeIdAndResolvedFalse(empId)
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    @Override
    public List<IssueResponse> getIssuesThisMonth() {
        LocalDate start = LocalDate.now().withDayOfMonth(1);
        LocalDate end = LocalDate.now();

        log.info("Fetching issues this month");

        return issueRepository.findByCreatedDateBetween(start, end)
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    @Override
    public List<String> getEmployeeNamesThisMonth() {
        LocalDate start = LocalDate.now().withDayOfMonth(1);
        LocalDate end = LocalDate.now();

      log.info("Fetching employee names this month ");
      return issueRepository.findEmployeeNamesThisMonth(start,end);
    }
}

//  log.info("Fetching employee names this month");
//
//        return issueRepository.findEmployeeNamesThisMonth(start, end)