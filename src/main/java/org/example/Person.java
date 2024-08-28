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
@Table(name="person")
public class Person {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private   long id;
  private  String name;
  private  int age;

}
