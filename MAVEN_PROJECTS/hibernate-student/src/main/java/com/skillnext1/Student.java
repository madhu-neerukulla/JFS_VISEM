package com.skillnext1;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String branch;
    private double fee;

    public Student() {}

    public Student(String name, String branch, double fee) {
        this.name = name;
        this.branch = branch;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public double getFee() {
        return fee;
    }
}
