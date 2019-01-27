package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {
    Student save(Student student);

    List<Student> getAll();

    Student getById(Integer id);

    List<Student> getByName(String name);
}
