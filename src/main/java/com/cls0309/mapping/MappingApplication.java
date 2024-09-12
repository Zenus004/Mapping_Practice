package com.cls0309.mapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MappingApplication {

    public static void main(String[] args) {
        ApplicationContext con = SpringApplication.run(MappingApplication.class, args);

        // Creating beans for repositories
        StudentRepository studentRepository = con.getBean(StudentRepository.class);
        CourseRepository courseRepository = con.getBean(CourseRepository.class);

        // Create new courses
        Course course1 = new Course();
        course1.setCourseId(1);
        course1.setCourseName("Spring Boot");

        Course course2 = new Course();
        course2.setCourseId(2);
        course2.setCourseName("Angular");

        Course course3 = new Course();
        course3.setCourseId(3);
        course3.setCourseName("Android");

        // Save courses
        courseRepository.save(course1);
        courseRepository.save(course2);
        courseRepository.save(course3);

        // Create new student
        Student student = new Student();
        student.setId(101);
        student.setName("Satyajyoti");

        Student student2 = new Student();
        student2.setId(102);
        student2.setName("Dhiraj");

        // Set permanent address
        Address address1 = new Address();
        address1.setAdd_id(1);
        address1.setCity("Khordha");
        address1.setState("Odisha");
        address1.setStudent(student);

        Address address2 = new Address();
        address2.setAdd_id(2);
        address2.setCity("Jatni");
        address2.setState("Odisha");
        address2.setStudent(student);

        // Adding addresses to lists
        List<Address> addressList1 = new ArrayList<>();
        addressList1.add(address1);
        addressList1.add(address2);
        student.setAddressList(addressList1);


        // Set courses
        List<Course> courses1 = new ArrayList<>();
        courses1.add(course1);
        courses1.add(course2);
        courses1.add(course3);
        student.setCourses(courses1);

        List<Course> courses2 = new ArrayList<>();
        courses2.add(course1);
        courses2.add(course2);
        courses2.add(course3);
        student2.setCourses(courses2);

        // Save students with addresses and courses
        studentRepository.save(student);
        studentRepository.save(student2);
    }
}
