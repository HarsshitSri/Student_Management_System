package com.harshit.student_management_system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor



    public class Student {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increments the primary key
        private Long id;

        @Column(name = "first_name", nullable = false)
        private String firstName;

        @Column(name = "last_name")
        private String lastName;

        @Column(nullable = false, unique = true)
        private String email;

        private int age;

        private String major;
    }

