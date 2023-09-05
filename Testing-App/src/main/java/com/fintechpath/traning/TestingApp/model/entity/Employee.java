package com.fintechpath.traning.TestingApp.model.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Table(name = "employee")
@Entity
@Data
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_name")
    private int id ;
    private String name;
    private double salary;

}
