package org.example;


import org.example.DAOs.CourseDAO;
import org.example.DAOs.PersonDAO;
import org.example.DAOs.StudentDAO;
import org.example.entities.Course;
import org.example.entities.Person;
import org.example.entities.Student;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CourseDAO courseDAO = new CourseDAO();
        StudentDAO studentDAO = new StudentDAO();


        Student student1 = Student.builder()
                .name("John")
                .email("student1@example.com")
                .address("Address 1")
                .age(19)
                .dateOfBirth(LocalDate.of(2005, 1, 15))
                .dateOfEnrollment(LocalDate.of(2023, 8, 1))
                .status("Active")
                .phoneNumber("1234567890")
                .build();

        Student student2 = Student.builder()
                .name("John2")
                .email("student2@example.com")
                .address("Address 2")
                .age(20)
                .dateOfBirth(LocalDate.of(2004, 2, 20))
                .dateOfEnrollment(LocalDate.of(2023, 8, 2))
                .status("Active")
                .phoneNumber("0987654321")
                .build();

        Student student3 = Student.builder()
                .name("John3")
                .email("student3@example.com")
                .address("Address 3")
                .age(21)
                .dateOfBirth(LocalDate.of(2003, 3, 25))
                .dateOfEnrollment(LocalDate.of(2023, 8, 3))
                .status("Inactive")
                .phoneNumber("1112223333")
                .build();

        Student student4 = Student.builder()
                .name("John4")
                .email("student4@example.com")
                .address("Address 4")
                .age(22)
                .dateOfBirth(LocalDate.of(2002, 4, 10))
                .dateOfEnrollment(LocalDate.of(2023, 8, 4))
                .status("Active")
                .phoneNumber("4445556666")
                .build();

        Student student5 = Student.builder()
                .name("John5")
                .email("student5@example.com")
                .address("Address 5")
                .age(23)
                .dateOfBirth(LocalDate.of(2001, 5, 5))
                .dateOfEnrollment(LocalDate.of(2023, 8, 5))
                .status("Active")
                .phoneNumber("7778889999")
                .build();

        Student student6 = Student.builder()
                .name("John6")
                .email("student6@example.com")
                .address("Address 6")
                .age(24)
                .dateOfBirth(LocalDate.of(2000, 6, 30))
                .dateOfEnrollment(LocalDate.of(2023, 8, 6))
                .status("Active")
                .phoneNumber("2223334444")
                .build();

        Student student7 = Student.builder()
                .name("John7")
                .email("student7@example.com")
                .address("Address 7")
                .age(25)
                .dateOfBirth(LocalDate.of(1999, 7, 12))
                .dateOfEnrollment(LocalDate.of(2023, 8, 7))
                .status("Inactive")
                .phoneNumber("5556667777")
                .build();

        Student student8 = Student.builder()
                .name("John8")
                .email("student8@example.com")
                .address("Address 8")
                .age(26)
                .dateOfBirth(LocalDate.of(1998, 8, 18))
                .dateOfEnrollment(LocalDate.of(2023, 8, 8))
                .status("Active")
                .phoneNumber("8889990000")
                .build();

        Student student9 = Student.builder()
                .name("John9")
                .email("student9@example.com")
                .address("Address 9")
                .age(27)
                .dateOfBirth(LocalDate.of(1997, 9, 22))
                .dateOfEnrollment(LocalDate.of(2023, 8, 9))
                .status("Active")
                .phoneNumber("3334445555")
                .build();

        Student student10 = Student.builder()
                .name("John10")
                .email("student10@example.com")
                .address("Address 10")
                .age(28)
                .dateOfBirth(LocalDate.of(1996, 10, 28))
                .dateOfEnrollment(LocalDate.of(2023, 8, 10))
                .status("Inactive")
                .phoneNumber("6667778888")
                .build();


/*
       studentDAO.create(student1);
        studentDAO.create(student2);
        studentDAO.create(student3);
        studentDAO.create(student4);
        studentDAO.create(student5);
        studentDAO.create(student6);
        studentDAO.create(student7);
        studentDAO.create(student8);
        studentDAO.create(student9);
        studentDAO.create(student10);

 */



        Course course1 = Course.builder()
                .name("Mathematics")
                .teacher("John Doe")
                .build();

        Course course2 = Course.builder()
                .name("Physics")
                .teacher("Jane Smith")
                .build();

        Course course3 = Course.builder()
                .name("Chemistry")
                .teacher("Emily Johnson")
                .build();

        Course course4 = Course.builder()
                .name("Biology")
                .teacher("Michael Brown")
                .build();

        Course course5 = Course.builder()
                .name("English Literature")
                .teacher("Sarah Davis")
                .build();

        Course course6 = Course.builder()
                .name("History")
                .teacher("David Wilson")
                .build();

        Course course7 = Course.builder()
                .name("Geography")
                .teacher("Linda Taylor")
                .build();

        Course course8 = Course.builder()
                .name("Computer Science")
                .teacher("Christopher Martinez")
                .build();

        Course course9 = Course.builder()
                .name("Art")
                .teacher("Barbara Anderson")
                .build();

        Course course10 = Course.builder()
                .name("Physical Education")
                .teacher("James Thomas")
                .build();

/*
        courseDAO.create(course1);
        courseDAO.create(course2);
        courseDAO.create(course3);
        courseDAO.create(course4);
        courseDAO.create(course5);
        courseDAO.create(course6);
        courseDAO.create(course7);
        courseDAO.create(course8);
        courseDAO.create(course9);
        courseDAO.create(course10);

 */


        Course course11 = Course.builder()
                .name("Advanced Mathematics")
                .teacher("Alice Cooper")
                .build();

        Course course12 = Course.builder()
                .name("Applied Mathematics")
                .teacher("Brian King")
                .build();

        Course course13 = Course.builder()
                .name("Mathematics for Engineers")
                .teacher("Catherine Brooks")
                .build();

        Course course14 = Course.builder()
                .name("Mathematics and Statistics")
                .teacher("Daniel White")
                .build();

        Course course15 = Course.builder()
                .name("Mathematics in Computer Science")
                .teacher("Elizabeth Green")
                .build();

        /*
        courseDAO.create(course11);
        courseDAO.create(course12);
        courseDAO.create(course13);
        courseDAO.create(course14);
        courseDAO.create(course15);

         */
        courseDAO.addCourse(course1);
        courseDAO.addCourse(course2);
        courseDAO.addCourse(course3);
        courseDAO.addCourse(course4);
        courseDAO.addCourse(course5);
        courseDAO.addCourse(course6);
        courseDAO.addCourse(course7);
        courseDAO.addCourse(course8);
        courseDAO.addCourse(course9);
        courseDAO.addCourse(course10);
        courseDAO.addCourse(course11);
        courseDAO.addCourse(course12);
        courseDAO.addCourse(course13);
        courseDAO.addCourse(course14);
        courseDAO.addCourse(course15);

        courseDAO.filterByCourseTaught("Math");

        List<Student> studentList=studentDAO.showAllEnrolletAfterSpecificYear(2021);
        for (int i=0;i<studentList.size();i++){
            System.out.println(studentList.get(i).getName() +", "+studentList.get(i).getPhoneNumber()+" "+studentList.get(i).getEmail()+" "+studentList.get(i).getAddress()+" "+studentList.get(i).getAge()+" "+studentList.get(i).getDateOfBirth()+" "+studentList.get(i).getDateOfEnrollment());
        }



    }
}