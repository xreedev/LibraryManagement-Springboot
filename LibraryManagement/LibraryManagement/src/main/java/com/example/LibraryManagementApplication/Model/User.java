package com.example.LibraryManagementApplication.Model;

public class User {
    private String name;
    private Integer age;
    private String id;


    public User(String name, Integer age, String favrt) {
        this.name = name;
        this.age = age;
        this.id = favrt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String favrt) {
        this.id = favrt;
    }
}
