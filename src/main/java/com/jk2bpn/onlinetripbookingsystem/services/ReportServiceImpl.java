package com.jk2bpn.onlinetripbookingsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk2bpn.onlinetripbookingsystem.entities.Report;
import com.jk2bpn.onlinetripbookingsystem.repository.IReportRepository;
@Service
public class ReportServiceImpl implements IReportService{
	@Autowired
    IReportRepository repo;
	@Override
	public Report addReport(Report report) {
		// TODO Auto-generated method stub
		System.out.println("Successfully saved");
		  return repo.save(report);
		
	}

	@Override
	public String deleteReport(Long reportId) {
		// TODO Auto-generated method stub
		System.out.println("Successfully deleted");
		  repo.deleteById(reportId);
		  return "Successfully deleted"+reportId;
	}

	
	@Override
	public Optional<Report> viewReport(Long reportId) {
		// TODO Auto-generated method stub
		return repo.findById(reportId);
	}

	@Override
	public List<Report> viewAllReports() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
