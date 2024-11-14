package com.SpringLearningcrud.learningcrud.Entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column (name = "Name")
    private String Name;
    @Column (name = "Gender")
    private String Gender;

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
@Column(name = "Department")
    private String Department;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public Date getDoB() {
        return DoB;
    }

    public void setDoB(Date doB) {
        DoB = doB;
    }
@Column(name = "Date of birth")
    private Date DoB;

    @Override
    public String toString(){
        return "Employee[id="+ ID + ", name = " + Name + ", gender =  " + Gender + ", department  = " + Department +", DoB =" + DoB + "]";
    }
    public void Employees(String Name, String Gender, String Department, int ID, Date DOB){
        this.Name=Name;
        this.ID=ID;
        this.Department=Department;
        this.Gender=Gender;
        this.DoB=DOB;

    }
}

