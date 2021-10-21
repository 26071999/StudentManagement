package com.prakash.StudentManagementSystem.student;

import com.prakash.StudentManagementSystem.student.Student;

import java.util.List;

public interface StudentService {
    List<Student>getAllStudents();
    Student  saveStudent(Student student);
    Student getStudentById(Integer id);
    Student editStudent(Student student);
    void deleteStudentById(Integer id);
}
