package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDAO  studentDAO=new StudentDAO();
        CurseDAO curseDAO=new CurseDAO();
        Student student1 = Student.builder()
                .name("John Doe")
                .phoneNumber("555-1234")
                .email("student1@example.com")
                .address("Address 1")
                .age(19)
                .dateOfBirth(LocalDate.of(2005, 1, 15))
                .dateOfEnrollment(LocalDate.of(2023, 8, 1))
                .status("Active")
                .build();

        Student student2 = Student.builder()
                .name("Jane Smith")
                .phoneNumber("555-1235")
                .email("student2@example.com")
                .address("Address 2")
                .age(20)
                .dateOfBirth(LocalDate.of(2004, 2, 20))
                .dateOfEnrollment(LocalDate.of(2023, 8, 2))
                .status("Active")
                .build();

        Student student3 = Student.builder()
                .name("Michael Johnson")
                .phoneNumber("555-1236")
                .email("student3@example.com")
                .address("Address 3")
                .age(21)
                .dateOfBirth(LocalDate.of(2003, 3, 25))
                .dateOfEnrollment(LocalDate.of(2023, 8, 3))
                .status("Active")
                .build();

        Student student4 = Student.builder()
                .name("Emily Davis")
                .phoneNumber("555-1237")
                .email("student4@example.com")
                .address("Address 4")
                .age(22)
                .dateOfBirth(LocalDate.of(2002, 4, 30))
                .dateOfEnrollment(LocalDate.of(2023, 8, 4))
                .status("Active")
                .build();

        Student student5 = Student.builder()
                .name("David Wilson")
                .phoneNumber("555-1238")
                .email("student5@example.com")
                .address("Address 5")
                .age(23)
                .dateOfBirth(LocalDate.of(2001, 5, 5))
                .dateOfEnrollment(LocalDate.of(2023, 8, 5))
                .status("Active")
                .build();

        Student student6 = Student.builder()
                .name("Sophia Brown")
                .phoneNumber("555-1239")
                .email("student6@example.com")
                .address("Address 6")
                .age(24)
                .dateOfBirth(LocalDate.of(2000, 6, 10))
                .dateOfEnrollment(LocalDate.of(2023, 8, 6))
                .status("Active")
                .build();

        Student student7 = Student.builder()
                .name("James Miller")
                .phoneNumber("555-1240")
                .email("student7@example.com")
                .address("Address 7")
                .age(25)
                .dateOfBirth(LocalDate.of(1999, 7, 15))
                .dateOfEnrollment(LocalDate.of(2023, 8, 7))
                .status("Active")
                .build();

        Student student8 = Student.builder()
                .name("Olivia Martinez")
                .phoneNumber("555-1241")
                .email("student8@example.com")
                .address("Address 8")
                .age(26)
                .dateOfBirth(LocalDate.of(1998, 8, 20))
                .dateOfEnrollment(LocalDate.of(2023, 8, 8))
                .status("Active")
                .build();

        Student student9 = Student.builder()
                .name("Benjamin Lee")
                .phoneNumber("555-1242")
                .email("student9@example.com")
                .address("Address 9")
                .age(27)
                .dateOfBirth(LocalDate.of(1997, 9, 25))
                .dateOfEnrollment(LocalDate.of(2023, 8, 9))
                .status("Active")
                .build();

        Student student10 = Student.builder()
                .name("Isabella Hernandez")
                .phoneNumber("555-1243")
                .email("student10@example.com")
                .address("Address 10")
                .age(28)
                .dateOfBirth(LocalDate.of(1996, 10, 30))
                .dateOfEnrollment(LocalDate.of(2023, 8, 10))
                .status("Active")
                .build();
       // studentDAO.create(student1);studentDAO.create(student2);studentDAO.create(student3);studentDAO.create(student4);studentDAO.create(student5);
       // studentDAO.create(student6);studentDAO.create(student7);studentDAO.create(student8);studentDAO.create(student9);studentDAO.create(student10);

        List<Student> studentList=studentDAO.showAllEnrolletAfterSpecificYear(2021);
        for (int i=0;i<studentList.size();i++){
            System.out.println(studentList.get(i).name+", "+studentList.get(i).phoneNumber+" "+studentList.get(i).email+" "+studentList.get(i).address+" "+studentList.get(i).age+" "+studentList.get(i).dateOfBirth+" "+studentList.get(i).dateOfEnrollment);
        }
    Course course1 = Course.builder()
            .name("Math")
            .phoneNumber("2323141212")
            .teacher("Bob")
            .build();

    Course course2 = Course.builder()
            .name("Physics")
            .phoneNumber("2323141213")
            .teacher("Alice")
            .build();

    Course course3 = Course.builder()
            .name("Chemistry")
            .phoneNumber("2323141214")
            .teacher("Charlie")
            .build();

    Course course4 = Course.builder()
            .name("Biology")
            .phoneNumber("2323141215")
            .teacher("David")
            .build();

    Course course5 = Course.builder()
            .name("English")
            .phoneNumber("2323141216")
            .teacher("Eva")
            .build();

    Course course6 = Course.builder()
            .name("History")
            .phoneNumber("2323141217")
            .teacher("Frank")
            .build();

    Course course7 = Course.builder()
            .name("Geography")
            .phoneNumber("2323141218")
            .teacher("Grace")
            .build();

    Course course8 = Course.builder()
            .name("Computer Science")
            .phoneNumber("2323141219")
            .teacher("Hannah")
            .build();

    Course course9 = Course.builder()
            .name("Art")
            .phoneNumber("2323141220")
            .teacher("Ian")
            .build();

    Course course10 = Course.builder()
            .name("Music")
            .phoneNumber("2323141221")
            .teacher("Jack")
            .build();

   // curseDAO.create(course1);curseDAO.create(course2);curseDAO.create(course3);curseDAO.create(course3);curseDAO.create(course4);
   // curseDAO.create(course5);curseDAO.create(course6);curseDAO.create(course7);curseDAO.create(course8);curseDAO.create(course9);curseDAO.create(course10);

    }
}

