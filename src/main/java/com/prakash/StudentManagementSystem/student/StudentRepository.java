package com.prakash.StudentManagementSystem.student;

import com.prakash.StudentManagementSystem.student.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {

}
