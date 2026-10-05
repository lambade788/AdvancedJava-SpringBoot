package com.model;

public class Teachers {

    private Long Id;
    private String Name;
    private String Email;
    private String Subject;

    public Teachers() {
    }

    public Teachers( String name, String email, String subject) {
        Name = name;
        Email = email;
        Subject = subject;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }
}
