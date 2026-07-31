
package com.retail.smartapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.smartapp.model.SalesReport;

@Repository
public interface SalesReportRepo extends JpaRepository<SalesReport, Long> {

}