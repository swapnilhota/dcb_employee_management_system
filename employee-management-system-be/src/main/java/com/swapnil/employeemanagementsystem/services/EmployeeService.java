package com.swapnil.employeemanagementsystem.services;

import com.swapnil.employeemanagementsystem.dto.EmployeeDTO;

public interface EmployeeService {
    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO findEmployeeById(String id);
}
