package com.scp.Hibernate.hibernateDemo2.OneToManyMapping;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentCourseMain {

	public static void main(String[] args) {
		
		CourseDetail c1=new CourseDetail(101, "java");
		CourseDetail c2=new CourseDetail(102, "c");
			
        List<CourseDetail>listOfCourseDetail1=new ArrayList<CourseDetail>();
        listOfCourseDetail1.add(c1);
        listOfCourseDetail1.add(c2);
       
        Student st1=new Student(3, "Akash", 21,listOfCourseDetail1);
        Student st2=new Student(4, "Rupa", 28, listOfCourseDetail1);
      
        SessionFactory factoy=new Configuration().configure("/com/scp/Hibernate/hibernateDemo2/OneToManyMapping/OneToMany.cfg.xml").buildSessionFactory();
        Session session=factoy.openSession();
        Transaction tr=session.beginTransaction();
        
        session.save(st1);
        session.save(st2);
        session.flush();
        tr.commit();
        System.out.println("saved successfully....");
        session.close();
	}

}
