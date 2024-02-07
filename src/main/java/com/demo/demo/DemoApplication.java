package com.demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Student student = new Student();
		student.id = 1;
		student.name="Gohul";
		student.age = 25;
		student.address = "Coimbatore";
		StudentController studentController = new StudentController(student);
		studentController.printStudent();


		/*Student s1 = new Student();
		s1.id = 2;
		s1.name = "Kumar";
		s1.address = "Coimbatore";

		System.out.println(s1.name);
		System.out.println(s1.id);
		System.out.println(s1.address);

		Student s2 = new Student();
		s2.id = 3;
		s2.name="Mano";
		s2.address = "Madurai";

		System.out.println(s2.name);
		System.out.println(s2.id);
		System.out.println(s2.address);*/



	}

}
