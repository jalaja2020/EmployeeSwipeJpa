package com.hcl.demo.entiy;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	
	private String empName;
	private String swipeIn;
	private String swipeOut;
	
	@Column(name ="location_name")
	private String locationName;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Date createDate;
	public Employee() {}
	public Employee(int empId, String empName, String swipeIn, String swipeOut, Date createDate, String locationName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.swipeIn = swipeIn;
		this.swipeOut = swipeOut;
		this.createDate = createDate;
		this.locationName = locationName;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getSwipeIn() {
		return swipeIn;
	}
	public void setSwipeIn(String swipeIn) {
		this.swipeIn = swipeIn;
	}
	public String getSwipeOut() {
		return swipeOut;
	}
	public void setSwipeOut(String swipeOut) {
		this.swipeOut = swipeOut;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

}
