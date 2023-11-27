package com.swapnil.employeemanagementsystem.services;

import com.swapnil.employeemanagementsystem.dto.EmployeeDTO;
import com.swapnil.employeemanagementsystem.entity.Employee;
import com.swapnil.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        Employee newEmployee = new Employee();
        BeanUtils.copyProperties(employeeDTO, newEmployee);
        employeeRepository.save(newEmployee);
        return employeeDTO;
    }
}
