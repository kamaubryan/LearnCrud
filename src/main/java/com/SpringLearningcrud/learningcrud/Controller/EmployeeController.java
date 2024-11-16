package com.SpringLearningcrud.learningcrud.Controller;

import com.SpringLearningcrud.learningcrud.Entity.Employee;
import com.SpringLearningcrud.learningcrud.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api")  // Optional, but you can specify the base path here
public class EmployeeController {

    @Autowired
    EmployeeRepo employeerepo;

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees(@RequestParam(required = false) String name) {
        try {
            List<Employee> employees = new ArrayList<>();
            // If name is provided, filter employees by name (assuming you have a method for this in your repository)
            if (name == null) {
                // If name is not provided, fetch all employees
                employeerepo.findAll().forEach(employees::add);
            } else {
//                employeerepo.findByName(name).forEach(employees::add);
            }
            if (employees.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);  // Return 204 if no employees found
            }
            return new ResponseEntity<>(employees, HttpStatus.OK);  // Return 200 if employees found
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);  // Return 500 in case of error
        }}
        @GetMapping("/Employee/{ID}")
                public ResponseEntity<Employee>getEmployeebyID(@PathVariable("id") long ID){
        Optional<Employee> EmployeeData= employeerepo.findById(ID);
        if(EmployeeData.isPresent()){
            return new ResponseEntity<>(EmployeeData.get(),HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(EmployeeData.get(),HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/Employee")
    public ResponseEntity<Employee> createTutorial(@RequestBody Employee tutorial) {
        try {
            Employee _tutorial = employeerepo.save(new Employee());
            return new ResponseEntity<>( HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

};
