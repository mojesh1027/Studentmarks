package com.mojesh.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class Student {
	@Id
	@Column(length=10)
	private Integer sid;
	@Column(length=40)
	private String fullname;
	@Column(length=10)
	private Integer sub1;
	@Column(length=10)
	private Integer sub2;
	@Column(length=10)
	private Integer sub3;
	@Column(length=10)
	private Double total;
	@Column(length=10)
	private Double percentage;
	@Column(length=10)
	private String grade;
	
	public Student() {
		super();
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Integer getSub1() {
		return sub1;
	}

	public void setSub1(Integer sub1) {
		this.sub1 = sub1;
	}

	public Integer getSub2() {
		return sub2;
	}

	public void setSub2(Integer sub2) {
		this.sub2 = sub2;
	}

	public Integer getSub3() {
		return sub3;
	}

	public void setSub3(Integer sub3) {
		this.sub3 = sub3;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", fullname=" + fullname + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3
				+ ", total=" + total + ", percentage=" + percentage + ", grade=" + grade + "]";
	}
	
	
}
