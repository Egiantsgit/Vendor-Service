package com.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vendor_details")
public class Vendor {
	@Id
	@Column(name="vendor_id")
	private int vendor_id;
	@Column(name="vendor_companyname")
	private String vendorCompanyName;
	@Column(name="person_name")
	private String personName;
	@Column(name="phone")
	private String phone;
	@Column(name="position_location")
	private String position_location;
	@Column(name="position_title")
	private String position_title;
	@Column(name="submitted_status")
	private String submitted_status;
	@Column(name="client")
	private String client;
	@Column(name="submitted_by")
	private String submitted_by;
	@Column(name="submitted_date")
	private Date submitted_date;
	public int getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getVendorCompanyName() {
		return vendorCompanyName;
	}
	public void setVendorCompanyName(String vendorCompanyName) {
		this.vendorCompanyName = vendorCompanyName;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPosition_location() {
		return position_location;
	}
	public void setPosition_location(String position_location) {
		this.position_location = position_location;
	}
	public String getPosition_title() {
		return position_title;
	}
	public void setPosition_title(String position_title) {
		this.position_title = position_title;
	}
	public String getSubmitted_status() {
		return submitted_status;
	}
	public void setSubmitted_status(String submitted_status) {
		this.submitted_status = submitted_status;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getSubmitted_by() {
		return submitted_by;
	}
	public void setSubmitted_by(String submitted_by) {
		this.submitted_by = submitted_by;
	}
	public Date getSubmitted_date() {
		return submitted_date;
	}
	public void setSubmitted_date(Date submitted_date) {
		this.submitted_date = submitted_date;
	}
	
	
}
