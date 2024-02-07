package com.demo.demo.controller;

import com.demo.demo.model.Staff;
import com.demo.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    //Field Injection - Dependecy Injection
//    @Autowired
//    private Student student;

    private Student student;
    private Staff staff;

    //Constructor Injection
    @Autowired
    StudentController(Student student, Staff staff)
    {
        this.student = student;
        this.staff = staff;
    }

    @GetMapping("/name")
    public String getName()
    {
        return "Welcome";
    }

    @GetMapping("/student")
    public Student getStudent()
    {
        //Student student = new Student();
        student.id   = 1;
        student.name = "Gohul";
        student.age = 25;
        student.address = "Coimbatore";
        return student;
    }

    @GetMapping("/staff_details")
    public Staff getStaff()
    {
        //Staff staff = new Staff();
        staff.id = 2;
        staff.staffName = "Hariharan";
        return staff;
    }

}
