package com.example.taskmanagerapi.model;

public class User {

    private  String firtName;
    private String lastName;
    private String username;
    private String password;
    private String image;

    public User(String firtName, String lastName, String username, String password, String image) {
        this.firtName = firtName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.image = image;
    }



    public String getFirtName() {
        return firtName;
    }

    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }







}
