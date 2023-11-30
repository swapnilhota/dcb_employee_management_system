package com.swapnil.employeemanagementsystem.services;

import com.swapnil.employeemanagementsystem.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO findEmployeeById(String id);

    List<EmployeeDTO> findAllEmployees();
}
