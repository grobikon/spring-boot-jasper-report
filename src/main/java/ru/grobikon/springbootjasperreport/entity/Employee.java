package ru.grobikon.springbootjasperreport.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EMPLOYEE_TBL")
public class Employee {
    @Id
    private int id;
    private String name;
    private String designation;
    private double salary;
    private String doj;
}
