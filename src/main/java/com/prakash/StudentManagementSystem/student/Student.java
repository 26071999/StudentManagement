package com.prakash.StudentManagementSystem.student;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "student_table")
@Getter
@Setter
@ToString
public class Student  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;
    @Column(name = "first_name",nullable = false,length = 20)
    private String firstName;
    @Column(name = "last_name",length = 20)
    private String lastName;
    @Column(name = "email_id",length = 45)
    private String email;

}
