package com.retail.smartapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retail.smartapp.model.SalesReport;
import com.retail.smartapp.service.SalesReportService;

@RestController
@RequestMapping("/sales-reports")
public class SalesReportController {

    @Autowired
    private SalesReportService salesReportService;

    @GetMapping
    public List<SalesReport> getAllUsersReport() {
        return salesReportService.getAllUsersReport();
    }

    @GetMapping("/{id}")
    public Optional<SalesReport> getReportById(@PathVariable Long id) {
        return salesReportService.getReportById(id);
    }

    @PostMapping
    public SalesReport saveReport(@RequestBody SalesReport salesReport) {
        return salesReportService.CreateReport(salesReport);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        salesReportService.deleteUser(id);
        return "Sales Report Deleted Successfully";
    }
}