package net.javaguides.studentmanagementsystem.service;

import net.javaguides.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllAtudent();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);

}
