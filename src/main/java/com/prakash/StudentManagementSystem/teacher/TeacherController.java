package com.prakash.StudentManagementSystem.teacher;

import com.prakash.StudentManagementSystem.student.Student;
import com.prakash.StudentManagementSystem.student.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.awt.*;
import java.util.List;

@Controller
public class TeacherController {


    @Autowired
    private TeacherServiceImpl teacherService;
    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping(" ")
    public String home() {
        return "home";
    }

    @GetMapping("/register")
    public String showSignupForm(Model model) {

        model.addAttribute("teacher", new Teacher());
        return "signup_form";
    }

    @PostMapping("/process_register")
    public String studentPage(Teacher teacher) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(teacher.getPassword());
        teacher.setPassword(encodedPassword);
        teacherService.saveTeacher(teacher);
        return "register_success";
    }

    @GetMapping("/students")
    public String getAllStudents(Model model) {
        List<Student> allStudents = studentService.getAllStudents();
        model.addAttribute("studentsList", allStudents);
        return "students";
    }

    @PostMapping("/logout")
    public String logout(){
        return "redirect:/ ";
    }
}