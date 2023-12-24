package com.luv2code.eps.EmployeePayrollsystem.dao;

import com.luv2code.eps.EmployeePayrollsystem.entity.Employee;

public interface EmployeeDAO {
    void save (Employee theemployee);
    Employee findById ( Integer id);

    void update(Employee theemployee);

    void delete(Integer id);


}
