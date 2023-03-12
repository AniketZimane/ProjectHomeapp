package com.example.ProjectHomeapp.Entity;

import jakarta.persistence.*;

@Entity
public class Studentinfo
{
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stu_seq")
    @SequenceGenerator(name = "stu_seq")
    @Id
    long id;
    String email;
    String password;

    public Studentinfo() {
    }

    public Studentinfo(long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
