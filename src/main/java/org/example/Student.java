package org.example;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

/**
 * @author laith kaseb
 **/

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @Column(name="phone_number",unique = true)
    String phoneNumber;
    int age;
    @Column(name="email",unique = true)
    String email;
    String address;
    String status;
    LocalDate dateOfBirth;
    LocalDate dateOfEnrollment;


}
