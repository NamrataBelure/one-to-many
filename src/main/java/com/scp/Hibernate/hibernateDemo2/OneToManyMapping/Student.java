package com.scp.Hibernate.hibernateDemo2.OneToManyMapping;

import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="studentDb")
public class Student {
 @Id
 private int rollNo;
 private String name;
 private int Age;
 
 @OneToMany(cascade=CascadeType.ALL)
 @JoinColumn
 List<CourseDetail> course;

/**
 * @param rollNo
 * @param name
 * @param age
 * @param course
 */

public Student(int rollNo2, String name2, int i, Object course2) {
	super();
}

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", Age=" + Age + ", course=" + course + "]";
}

/**
 * @param rollNo
 * @param name
 * @param age
 * @param course
 */
public Student(int rollNo, String name, int age, List<CourseDetail> course) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	Age = age;
	this.course = course;
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return Age;
}

public void setAge(int age) {
	Age = age;
}

public List<CourseDetail> getCourse() {
	return course;
}

public void setCourse(List<CourseDetail> course) {
	this.course = course;
}


}
