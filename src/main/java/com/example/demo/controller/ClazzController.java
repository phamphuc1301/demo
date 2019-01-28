package com.example.demo.controller;

import com.example.demo.entity.Clazz;
import com.example.demo.service.ClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class ClazzController {

    @Autowired
    private ClazzService clazzService;

    @GetMapping("/clazz")
    @ResponseBody
    public List<Clazz> getAllClazz() {
        return clazzService.getAll();
    }

    @PostMapping("/clazz")
    public Clazz save(@RequestBody Clazz clazz) {
        return clazzService.save(clazz);
    }

    @GetMapping("/clazz/{id}")
    public Clazz getClazzById(@PathVariable int id) {
        return clazzService.getById(id);
    }
}
