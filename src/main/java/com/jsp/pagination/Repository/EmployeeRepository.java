package com.jsp.pagination.Repository;

import com.jsp.pagination.Entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

      Page<Employee> findByName(String name, Pageable pageable);
}
