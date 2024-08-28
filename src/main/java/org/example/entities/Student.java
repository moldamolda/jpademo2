package org.example.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

/**
 * Purpose:
 *
 * @author: Jeppe Koch
 */
    @Getter
    @Setter
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    @Entity
    @Table(name = "student")
    public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String name;
        private int age;
        @Column(name = "phone_number", unique = true)
        private String phoneNumber;
        @Column(name = "email", unique = true)
        private String email;
        private String address;
        private String status;
        private LocalDate dateOfBirth;
        private LocalDate dateOfEnrollment;


    }

