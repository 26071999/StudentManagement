package com.prakash.StudentManagementSystem;

import com.prakash.StudentManagementSystem.student.Student;
import com.prakash.StudentManagementSystem.student.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private StudentServiceImpl service;



    @GetMapping("/students/new")
    public String createNewStudent(Model model){
        model.addAttribute("student",new Student());
        return "student_form";
    }

    @PostMapping("/students")
    public String postStudent(@ModelAttribute("student") Student student,RedirectAttributes ra){
        service.saveStudent(student);
        ra.addFlashAttribute("message","The new Student has been added successfully!!!");
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable("id") Integer id,Model model){
        Student studentById = service.getStudentById(id);
        model.addAttribute("student",studentById);
        return "edit_form";
    }

   @PostMapping("/students/save")
    public String updateStudent(@ModelAttribute("student") Student student){
      service.editStudent(student);
       return "redirect:/students";
   }

   @GetMapping("/students/delete/{id}")
    public String deleteStudent(@PathVariable("id")Integer id, RedirectAttributes ra){

        service.deleteStudentById(id);

        ra.addFlashAttribute("message","The User Id "+id+" had been deleted Successfully!!!");
        return "redirect:/students";
   }
}
