package com.SpringLearningcrud.learningcrud.Controller;

import com.SpringLearningcrud.learningcrud.Entity.Employee;
import com.SpringLearningcrud.learningcrud.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping
public class EmployeeController {
@Autowired
    EmployeeRepo Employeerepo;
@GetMapping("/api")
    public ResponseEntity<List<Employee>> getAllEmployees(@RequestParam(required = false) String Name){
    try {
        List<Employee> employees = new ArrayList<>();
        if (Name == null) {
            Employeerepo.findAll().forEach(employees::add);
        } else
            Employeerepo.findAllById(Id).forEach(employees::add);
    } finally {

    }
    ;
}
}
