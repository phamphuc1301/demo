package com.example.demo.service;

import com.example.demo.entity.Clazz;

import java.util.List;

public interface ClazzService {

    Clazz save(Clazz clazz);

    List<Clazz> getAll();

    Clazz getById(int id);
}
