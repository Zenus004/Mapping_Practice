//package com.cls0309.mapping;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name="lap_data")
//public class Laptop {
//    @Id
//    private int lapID;
//    private String model;
//    private int price;
//
//    @OneToOne(mappedBy= "laptop", cascade = CascadeType.ALL)
//    private Employee employee;
//
//    public Laptop() {
//        super();
//    }
//
//    public int getLapID() {
//        return lapID;
//    }
//
//    public void setLapID(int lapID) {
//        this.lapID = lapID;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public Employee getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
//
//    public Laptop(int lapID, String model, int price) {
//        this.lapID = lapID;
//        this.model = model;
//        this.price = price;
//    }
//}
