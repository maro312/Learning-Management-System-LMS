package org.example.learningmanagementsystemlms.Controller;

import jakarta.servlet.http.HttpServletResponse;
import org.example.learningmanagementsystemlms.Model.StudentPerformance;
import org.example.learningmanagementsystemlms.Service.PerformanceReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;


@RestController
public class PerformanceController {
    @Autowired
    private PerformanceReportService reportService;

    @GetMapping("/admin/report")
    public void generateReport(@RequestParam List<Long> studentIds, HttpServletResponse response) throws IOException {
        System.out.println("yaaa");
        List<StudentPerformance> performances = fetchStudentPerformance(studentIds);
        reportService.generateStudentPerformanceReport(performances, (javax.servlet.http.HttpServletResponse) response);
    }

    private List<StudentPerformance> fetchStudentPerformance(List<Long> studentIds) {
        // For demonstration, return mock data
        return List.of(
                new StudentPerformance(1L, "Marwan", 85.0, 90.0),
                new StudentPerformance(2L, "Bassem", 92.0, 95.0)
        );
    }
}
