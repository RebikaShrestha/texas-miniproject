package com.texas.miniprojecta.services;

import com.texas.miniprojecta.entity.Student;
import org.springframework.http.HttpStatusCode;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student createStudent(Student student);

    List<Student> getAll();

    Optional<Student> getById(Long id);

    void deleteStudent(Long id);

    Student updateStudent(Student student);

}
