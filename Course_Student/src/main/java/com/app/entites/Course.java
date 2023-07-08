package com.app.entites;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;



@Entity
@Table(name = "my_course")
public class Course extends BaseEntity {
	@Column(length = 20,nullable = false)
	private String name;
	@Enumerated(EnumType.STRING)
	@Column(length=20,nullable=false)
	private Category cateory;
	@Column(nullable = false)
	private LocalDate startDate;
	@Column(nullable = false)
	private LocalDate endDate;
	@Column(nullable = false)
	private double fee;
	public Course() {
		super();
	}
	public Course(String name, Category cateory, LocalDate startDate, LocalDate endDate, double fee) {
		super();
		this.name = name;
		this.cateory = cateory;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fee = fee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCateory() {
		return cateory;
	}
	public void setCateory(Category cateory) {
		this.cateory = cateory;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
}
