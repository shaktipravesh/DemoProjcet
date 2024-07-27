package com.example.demo;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {
    private static final Employees list = new Employees();

    static {
        list.getEmployeeList().add(new Employee(1, "Shakti", "Pravesh", "shaktipravesh@yahoo.co.in"));
        list.getEmployeeList().add(new Employee(2, "Beena", "Rathore", "rathorebeena@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "Suhasini", "Vincit", "suhasinivincit@gmail.co.com"));
    }

    public Employees getAllEmployees(){
        return  list;
    }

    public void addEmployee(Employee employee){
        list.getEmployeeList().add(employee);
    }
}
