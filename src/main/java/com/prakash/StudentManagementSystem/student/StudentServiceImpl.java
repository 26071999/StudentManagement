package com.prakash.StudentManagementSystem.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        Iterable<Student> studentList = studentRepository.findAll();
        return (List<Student>) studentList;
    }
    public Student saveStudent(Student student){

        return studentRepository.save(student);
    }

    public Student getStudentById(Integer id){
        return studentRepository.findById(id).get();
    }

    @Override
    public Student editStudent(Student student) {
     return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Integer id) {
        studentRepository.deleteById(id);
    }

    public Student editStudentById(Student student){
        return studentRepository.save(student);
    }
}
