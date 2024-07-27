package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    @Autowired(required = true)
    private EmployeeDAO employeeDao;

    @GetMapping(path = "/", produces = "application/json")
    public Employees getEmployees() {
        return employeeDao.getAllEmployees();
    }

    @PostMapping(path = "/",
    consumes = "application/json",
    produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee){
        Integer id = employeeDao.getAllEmployees().getEmployeeList().size() + 1;
        employee.setId(id);
        employeeDao.addEmployee(employee);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(employee.getId()).toUri();
        return  ResponseEntity.created(location).build();
    }
}




/*@RestController
public class Controller {

    @GetMapping("/")
    public String home() {
        String str = "<html><body><font color=\"green\">" +
                "<h1> Welcome Shakti</h1> +" +
                "</font></body></html>";
        return str;
    }

    @RequestMapping(method = {RequestMethod.GET}, value = {"/shakti"})
    public String info(){
        String str2 = "<html><body><font color=\"green\">" +
                "<h2> Welcome Shakti Once again</h2> +" +
                "</font></body></html>";
        return str2;
    }
}*/
