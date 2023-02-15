package com.demo.demospringboot.controller;

import com.demo.demospringboot.models.StudentModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    List<StudentModel> list = new ArrayList<>();

    @PostMapping("/{name}/{age}")
    public ResponseEntity<?> addStudentByPath(
            @PathVariable String name,
            @PathVariable int age
    ){
        StudentModel studentModel = new StudentModel();
        studentModel.setName(name);
        studentModel.setAge(age);
        list.add(studentModel);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<?> addStudentByParam(
                @RequestParam String name,
                @RequestParam int age
            ){
        StudentModel studentModel = new StudentModel();
        studentModel.setName(name);
        studentModel.setAge(age);
        list.add(studentModel);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<?> addStudentByBody(
            @RequestBody StudentModel studentModel
    ){
        list.add(studentModel);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
