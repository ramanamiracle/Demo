package com.tcs.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.tcs.beans.StudentBean;

public class StudentAction extends ActionSupport 
{
private static final long serialVersionUID = 1L;
private List<StudentBean> students = new ArrayList<StudentBean>();

public String displayStudentList() 
{
        students.add(new StudentBean("o7bb002", "Gokul", "ECE", 4));
        students.add(new StudentBean("o7bc074", "Muthu Vijay", "CSE", 6));
        students.add(new StudentBean("o7bb040", "Jaya Prakash", "ECE", 10));
        students.add(new StudentBean("o7bc055", "Mohiadeen", "CSE", 7));
        students.add(new StudentBean("o7bd047", "HariPriya", "IT", 1));
        students.add(new StudentBean("o7bd024", "Pavithra", "IT", 3));
        students.add(new StudentBean("o7bb009", "Aswin", "ECE", 8));
        students.add(new StudentBean("o7ba029", "Sharmila", "IT", 11));
        students.add(new StudentBean("o7ba027", "Nilafar", "IT", 2));
        students.add(new StudentBean("o7bd081", "Dinesh Babu", "MECH", 13));
        students.add(new StudentBean("o7ba062", "Lourde", "MECH", 9));
        students.add(new StudentBean("o7bc079", "Nisha", "CSC", 5));
        students.add(new StudentBean("o7bb039", "Guru Prasad", "MECH", 12));
        students.add(new StudentBean("o7bc033", "Gowtham Raj", "CSE", 15));
        students.add(new StudentBean("o7bb039", "Ibrahim Sha", "ECE", 14));
        students.add(new StudentBean("o7bd081", "Dinesh Babu", "MECH", 16));

        return SUCCESS;
}

public List<StudentBean> getStudents() 
{
        return students;
}

public void setStudents(List<StudentBean> students) 
{
        this.students = students;
}
}
