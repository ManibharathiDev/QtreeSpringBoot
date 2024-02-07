package com.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


public class StudentController {


    private Student student;


    StudentController(Student student)
    {
        this.student = student;
    }




    public void printStudent()
    {
       // Student student = new Student(1,"Gohul","Coimbatore",25);
//        student.name = "Gohul";
//        student.id   = 1;
//        student.age = 25;
//        student.address = "Coimbatore";

        System.out.println(student.name);
        System.out.println(student.id);
        System.out.println(student.address);

    }

}


