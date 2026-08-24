package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.SalesReport;
import com.retail.smartapp.repo.SalesReportRepo;

@Service
public class SalesReportService {

    @Autowired
    private SalesReportRepo salesReportRepo;

    // GET - Get All Sales Reports
    public List<SalesReport> getAllUsersReport() {
        return salesReportRepo.findAll();
    }

    // GET - Get Sales Report By ID
    public Optional<SalesReport> getReportById(Long id) {
        return salesReportRepo.findById(id);
    }

    // POST - Create Sales Report
    public SalesReport CreateReport(SalesReport salesReport) {
        return salesReportRepo.save(salesReport);
    }

    // PUT - Update Sales Report
    public SalesReport updateReport(Long id, SalesReport salesReport) {

        SalesReport existingReport = salesReportRepo.findById(id)
                .orElseThrow(() ->
                    new RuntimeException(
                        "Sales Report not found with id: " + id));

        // Update SalesReport fields here
        // Example:
        // existingReport.setTotalSales(salesReport.getTotalSales());
        // existingReport.setReportDate(salesReport.getReportDate());

        return salesReportRepo.save(existingReport);
    }

    // DELETE - Delete Sales Report
    public void deleteUser(Long id) {
        salesReportRepo.deleteById(id);
    }
}