package com.SpringLearningcrud.learningcrud.Repository;


import com.SpringLearningcrud.learningcrud.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
//import com.SpringLearningcrud.learningcrud.Entity.h2.model.Tutorial;
import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    List<Employee>FindbyId(int ID);
    List<Employee>FindbyName(String Name);

    Iterable<Object> findByName(String Name);
}
//import com.SpringLearningcrud.learningcrud.Entity.Employee;
//import com.SpringLearningcrud.learningcrud.Services.EmployeeServices;
//import jakarta.persistence.EntityManager;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public class EmployeeRepo implements EmployeeServices {
//    @Autowired
//    private EntityManager entityManager;
//
//    @Override
//    public Optional<Employee> getProductById(int ID) {
//        return Optional.empty();
//    }
//
//    @Override
//    public Optional<Employee> getEmployeeById(int ID) {
//        return Optional.empty();
//    }
//
//
//    @Override
//public List<Employee>get(){
//    return null;
//}
//@Override
//    public Employee get(int ID){
//        return null;
//}
//@Override
//public Optional<Employee> save(Employee employee){
//    Optional<Employee>empoyee1 = Optional.empty();
//    return empoyee1;
//}
//
//    @Override
//    public void delete(int ID) {
//        Optional<Employee> employee1 = Optional.empty();
//    }
//
//    @Override
//    public void Create(Employee employee) {
//Optional<Employee>employee1 = Optional.empty();
//employee1.isPresent();
//    }
//
//    @Override
//    public void update(Employee employee, int ID, String Name, String Gender, String Department) {
//Optional<Employee>employee1 = Optional.empty();
//employee1.get().setID(employee.getID());
//employee1.get().setName(employee.getName());
//employee1.get().setGender(employee.setGender( String Gender));
//employee1.get().setDepartment(employee.setDepartment(String Department));
//employee1.get().setDoB(employee.getDoB());
//    };
//
//
//}
