package org.example;

import org.example.entities.Course;
import org.example.entities.DAO.CourseDAO;
import org.example.entities.DAO.StudentDAO;
import org.example.entities.Student;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {



        CourseDAO courseDAO = new CourseDAO();

        Course math = new Course(3, "ewer","efwef",
                3,"asd",LocalTime.now());

        courseDAO.create(math);


        StudentDAO studentDAO = new StudentDAO();
/*
        studentDAO.create(Student.builder()
                .name("Daniel")
                .address("svanevej")
                .phonenumber(123123)
                .dateOfEnrollment(LocalDate.now())
                .build()
        );

        courseDAO.create(Course.builder()
                .courseName("Course1")
                .courseTeacher("Jon")
                .semester(3)
                .classroom("Open Learning")
                .timeOfCourse(LocalTime.now())
                .build()
        );

        courseDAO.create(Course.builder()
                .courseName("Course2")
                .courseTeacher("Thomas")
                .semester(3)
                .classroom("Open Learning")
                .timeOfCourse(LocalTime.now())
                .build()
        );

 */

    }
}