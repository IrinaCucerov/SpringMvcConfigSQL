package com.spring.mvc.models;

import jakarta.validation.constraints.*;

public class Person {
    private int id;
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 25, message =
            "Name should be between 2 and 35 characters")
    private String name;

    @Min(value = 0, message = "Age should be greater then 0")
    private int age;

    @NotEmpty(message = "Name should not be empty")
    @Email(message = "Email should be valid")
    private String email;

    // Country, City, Index (6 numbers) - www.rexegg.com/regex-quickstart.html
    @Pattern(regexp = "[A-Z]\\w+, [A-Z]\\w+, \\d{6}", message =
            "Your address should be in this format: Country, City, Postal Cod (6 digits)")
    private String address;

    public Person(int id, String name, int age, String email, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
