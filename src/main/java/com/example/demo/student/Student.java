package com.example.demo.student;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@Data
public class Student {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Student(Long id,
                   String name,
                   String email,
                   LocalDate dob,
                   Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
    public void newFunction() {
        System.out.println("sss");
    }
}
