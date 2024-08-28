package org.example;

import jakarta.persistence.*;
import lombok.*;

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
@Table(name = "course")

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String teacher;
    private String name;
    private String phoneNumber;

}
