package com.entitymanagerexample.CrudEntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Service
@Transactional
public class EmployeeService {

    @Autowired
    private EntityManager entityManager;

    public Employee AddEmployee(Employee employee){
        entityManager.persist(employee);
        return employee;
    }
    public Employee getAEmployeeById(Long id){
        return entityManager.find(Employee.class, id);
    }
    public Employee updateEmployee(Employee employee){
        return entityManager.merge(employee);
    }

    public Employee deleteEmployee(Employee employee){

        if (entityManager.contains(employee))
            entityManager.remove(employee);
        entityManager.remove(entityManager.merge(employee));

        return employee;
    }


}
