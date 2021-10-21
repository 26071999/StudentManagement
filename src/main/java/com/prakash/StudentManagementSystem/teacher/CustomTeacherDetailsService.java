package com.prakash.StudentManagementSystem.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomTeacherDetailsService implements UserDetailsService {


    @Autowired
    private TeacherRepository repo;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Teacher teacher = repo.findByEmail(email);
        if(teacher==null)
            throw new UsernameNotFoundException("User Not Found ! Please Enter Correct Email Id");
        return new CustomTeacherDetails(teacher);
    }
}
