package com.luv2code.eps.EmployeePayrollsystem.dao;

import com.luv2code.eps.EmployeePayrollsystem.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    private EntityManager entityManager;
    @Autowired

    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public void save (Employee theemployee){
        entityManager.persist(theemployee);
    }

    @Override
    public Employee findById(Integer id) {
        return entityManager.find(Employee.class,id);//here Employee.class is entity and id is primary key
    }

    @Override
    @Transactional
    public void update(Employee theemployee) {
        entityManager.merge(theemployee);//for Updation we used Transactional & Merge method
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        Employee theEmployee = entityManager.find(Employee.class, id);
        entityManager.remove(theEmployee);

    }


}
