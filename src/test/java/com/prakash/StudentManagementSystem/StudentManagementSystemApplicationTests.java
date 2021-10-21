package com.prakash.StudentManagementSystem;

import com.prakash.StudentManagementSystem.student.Student;
import com.prakash.StudentManagementSystem.student.StudentRepository;
import com.prakash.StudentManagementSystem.teacher.Teacher;
import com.prakash.StudentManagementSystem.teacher.TeacherRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentManagementSystemApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private TeacherRepository repository;

	@Test
	public void testAddNewStudent(){
		Student student=new Student();
		student.setEmail("mukesh30101@gmail.com");
		student.setFirstName("Mukesh");
		student.setLastName("Arjunan");
		Student saveStudent = studentRepository.save(student);
		Assertions.assertThat(saveStudent.getEmail()).matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
	}

	@Test
	public void testFindUserByEmail(){
		String email="hariharan@gmail.com";
		Teacher byEmail = repository.findByEmail(email);
		Assertions.assertThat(byEmail).isNotNull();

	}

}
