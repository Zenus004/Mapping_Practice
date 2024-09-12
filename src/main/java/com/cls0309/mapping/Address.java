package com.cls0309.mapping;

import jakarta.persistence.*;

@Entity
@Table(name = "std_add")
public class Address {
    @Id
    private int add_id;
    private String city;
    private String state;

    @ManyToOne(cascade = CascadeType.ALL)
    private Student student;

    public int getAdd_id() {
        return add_id;
    }

    public void setAdd_id(int add_id) {
        this.add_id = add_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Address(int add_id, Student student, String state, String city) {
        this.add_id = add_id;
        this.student = student;
        this.state = state;
        this.city = city;
    }

    public Address() {
        super();
    }
}
