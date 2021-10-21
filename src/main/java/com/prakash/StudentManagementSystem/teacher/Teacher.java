package com.prakash.StudentManagementSystem.teacher;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "teacher_table")
@Getter
@Setter
@ToString
public class Teacher {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false,unique = true,length = 45)
    private String email;


    @Column(name = "first_name" ,nullable = false,length = 20)
    private String firstName;

    @Column(name = "last_name",nullable = false,length = 20)
    private String lastName;

    @Column(name = "password",nullable = false,length = 25)
    private String password;
    @Column(name = "birth_date",nullable = false)
    private String birthDate;

    @Column(name = "mobile_number",nullable = false,length = 10)
    private Long mobileNumber;
    @Column(name = "gender",nullable = false)
    private String gender;

}
