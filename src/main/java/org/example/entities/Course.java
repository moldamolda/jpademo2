package org.example.entities;

import jakarta.persistence.*;
import lombok.*;


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
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String teacher;



}
