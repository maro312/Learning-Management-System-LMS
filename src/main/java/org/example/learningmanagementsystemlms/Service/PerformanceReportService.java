package org.example.learningmanagementsystemlms.Service;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.learningmanagementsystemlms.Model.StudentPerformance;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@Service
public class PerformanceReportService {

    public void generateStudentPerformanceReport(List<StudentPerformance> performances, HttpServletResponse response) throws IOException {
        // Create a workbook
        Workbook workbook = new XSSFWorkbook();

        // Create a sheet in the workbook
        Sheet sheet = workbook.createSheet("Student Performance");

        // Create header row
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Student ID");
        headerRow.createCell(1).setCellValue("Name");
        headerRow.createCell(2).setCellValue("Grade");
        headerRow.createCell(3).setCellValue("Attendance");

        // Add data rows
        int rowNum = 1;
        for (StudentPerformance performance : performances) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(performance.getStudentId());
            row.createCell(1).setCellValue(performance.getStudentName());
            row.createCell(2).setCellValue(performance.getGrade());
            row.createCell(3).setCellValue(performance.getAttendance());
        }

        // Set response content type and file download headers
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setHeader("Content-Disposition", "attachment; filename=student_performance_report.xlsx");

        // Write the workbook to the output stream
        try {
            workbook.write(response.getOutputStream());
        } finally {
            // Close the workbook to release resources
            workbook.close();
        }
    }
}
