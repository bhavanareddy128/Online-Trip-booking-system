package com.jk2bpn.onlinetripbookingsystem.services;
import java.util.List;
import java.util.Optional;

import com.jk2bpn.onlinetripbookingsystem.entities.Report;

public interface IReportService {
	public Report addReport(Report report);

	public List<Report> viewAllReports();
	String deleteReport(Long reportId);
	Optional<Report> viewReport(Long reportId);
}