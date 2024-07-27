package com.example.demo;

public class Employee {
    public Employee() {
    }

    public Employee(Integer id, String firstName, String lastName, String emailId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    private  Integer id;
    private  String firstName;
    private  String lastName;
    private  String emailId;

    public String toString(){
        return "Employee [id = " + id + ", firstName = " + firstName + "' lastName = " + lastName + ", emailId = " + emailId + "]";
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
