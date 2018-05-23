package com.workout.j9.j9workout.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PUBLIC)

public class Employee {

    @Id
    @GeneratedValue
    protected Long id;
    @Column
    protected String firstName;
    @Column
    private String lastName;
    @Column
    private int age;
    @Column
    private boolean isDev;
}
