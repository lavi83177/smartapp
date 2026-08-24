package com.retail.smartapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.retail.smartapp.model.SalesReport;
import com.retail.smartapp.service.SalesReportService;

@RestController
@RequestMapping("/api/sales-reports")
public class SalesReportController {

    @Autowired
    private SalesReportService salesReportService;

    // GET - Get All Sales Reports
    @GetMapping
    public List<SalesReport> getAllUsersReport() {
        return salesReportService.getAllUsersReport();
    }

    // GET - Get Sales Report By ID
    @GetMapping("/{id}")
    public Optional<SalesReport> getReportById(@PathVariable Long id) {
        return salesReportService.getReportById(id);
    }

    // POST - Create Sales Report
    @PostMapping
    public SalesReport saveReport(@RequestBody SalesReport salesReport) {
        return salesReportService.CreateReport(salesReport);
    }

    // PUT - Update Sales Report
    @PutMapping("/{id}")
    public SalesReport updateReport(
            @PathVariable Long id,
            @RequestBody SalesReport salesReport) {

        return salesReportService.updateReport(id, salesReport);
    }

    // DELETE - Delete Sales Report
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        salesReportService.deleteUser(id);
        return "Sales Report Deleted Successfully";
    }
}