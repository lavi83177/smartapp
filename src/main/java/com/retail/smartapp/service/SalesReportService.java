package com.retail.smartapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.smartapp.model.SalesReport;
import com.retail.smartapp.repo.SalesReportRepo;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class SalesReportService {
	@Autowired
	private SalesReportRepo salesReportRepo;
	
	public List<SalesReport> getAllUsersReport(){
		return salesReportRepo.findAll();
	}
	public Optional<SalesReport> getReportById(Long id){
		return salesReportRepo.findById(id);
	}
	public SalesReport CreateReport(SalesReport salesReport) {
		return salesReportRepo.save(salesReport);
	}
	public void deleteUser(Long id) {
		salesReportRepo.deleteById(id);
	}
	
	
}
