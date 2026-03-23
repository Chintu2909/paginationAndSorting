package com.jsp.pagination.Service;

import com.jsp.pagination.Entity.Employee;
import com.jsp.pagination.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> fetchAllEmployees(Pageable pageable) {

            return employeeRepository.findAll(pageable).getContent();

    }
}
