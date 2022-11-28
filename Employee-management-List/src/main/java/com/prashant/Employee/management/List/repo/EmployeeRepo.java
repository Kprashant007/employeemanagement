package com.prashant.Employee.management.List.repo;

import com.prashant.Employee.management.List.model.EmployeeList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeList, Long> {
//    EmployeeList save(EmployeeList employeeList);
}
