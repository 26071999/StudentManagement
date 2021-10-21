package com.prakash.StudentManagementSystem;

import com.prakash.StudentManagementSystem.student.Student;
import com.prakash.StudentManagementSystem.student.StudentRepository;
import com.prakash.StudentManagementSystem.student.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication {

	public static void main(String[] args)	 {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
}
