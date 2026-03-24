package org.example.assessment24march.repository;

import org.example.assessment24march.entity.Issue;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;

public interface IssueRepository extends JpaRepository<Issue, Long> {

    List<Issue> findByEmployeeIdAndResolvedFalse(Long empId);

    List<Issue> findByCreatedDateBetween(LocalDate start, LocalDate end);

    @Query("SELECT DISTINCT i.employee.name FROM Issue i WHERE i.createdDate BETWEEN :start AND :end")
    List<String> findEmployeeNamesThisMonth(LocalDate start, LocalDate end);
}
