package com.backend.demo.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="employess")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name" , nullable = false)
    private String firstName;
    @Column(name = "last_name" , nullable = false)
    private String lastName;
    @Column(name = "email")
    private String email;
}
