//package com.cls0309.mapping;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name="emp_data")
//public class Employee {
//    @Id
//    private int empId;
//    private String empName;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "lap_id")
//    private Laptop laptop;
//
//    public int getEmpId() {
//        return empId;
//    }
//
//    public void setEmpId(int empId) {
//        this.empId = empId;
//    }
//
//    public String getEmpName() {
//        return empName;
//    }
//
//    public void setEmpName(String empName) {
//        this.empName = empName;
//    }
//
//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }
//
//    public Employee(int empId, String empName, Laptop laptop) {
//        this.empId = empId;
//        this.empName = empName;
//        this.laptop = laptop;
//    }
//
//    public Employee() {
//        super();
//    }
//}
