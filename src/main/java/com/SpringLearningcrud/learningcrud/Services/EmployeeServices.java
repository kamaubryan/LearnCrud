package com.SpringLearningcrud.learningcrud.Services;

import com.SpringLearningcrud.learningcrud.Entity.Employee;
import com.SpringLearningcrud.learningcrud.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;


public interface EmployeeServices {
    @Autowired
    EmployeeRepo employeeRepo = null;

public  Optional<Employee> getProductById(int ID);

    Optional<Employee> getEmployeeById(int ID);

    List<Employee> get();
    Employee get(int ID);
    Optional<Employee> save(Employee employee);
    void delete(int ID);
    void Create(Employee employee);
    void update(Employee employee, int ID, String Name, String Gender, String Department);

}