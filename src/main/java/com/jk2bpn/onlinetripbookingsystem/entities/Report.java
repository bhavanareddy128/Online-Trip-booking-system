package com.jk2bpn.onlinetripbookingsystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="REPORT")
public class Report {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "REPORT_ID")
int reportId;
String reportType;
String reportName;

public Report(int reportId, String reportType, String reportName) {
	super();
	this.reportId = reportId;
	this.reportType = reportType;
	this.reportName = reportName;
}
public int getReportId() {
	return reportId;
}
public void setReportId(int reportId) {
	this.reportId = reportId;
}
public String getReportType() {
	return reportType;
}
public void setReportType(String reportType) {
	this.reportType = reportType;
}
public String getReportName() {
	return reportName;
}
public void setReportName(String reportName) {
	this.reportName = reportName;
}
}