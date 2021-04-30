package com.entitymanagerexample.CrudEntityManager;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Employee_Details")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;
    private String empName;
    private String empDepartment;
    private Integer empSalary;


}
