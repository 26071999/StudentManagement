package com.prakash.StudentManagementSystem.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository repo;
    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return repo.save(teacher);
    }
}
