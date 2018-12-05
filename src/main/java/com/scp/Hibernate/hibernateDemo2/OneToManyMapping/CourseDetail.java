package com.scp.Hibernate.hibernateDemo2.OneToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class CourseDetail{
	@Id
	private int CourseNo;
	private String coursename;
	
	
	public CourseDetail(int courseNo, String coursename) {
		super();
		this.CourseNo = courseNo;
		this.coursename = coursename;
		
	}

	
	public CourseDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCourseNo() {
		return CourseNo;
	}

	public void setCourseNo(int courseNo) {
		CourseNo = courseNo;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	

	@Override
	public String toString() {
		return "Course [CourseNo=" + CourseNo + ", coursename=" + coursename + "]";
	}

	
}
