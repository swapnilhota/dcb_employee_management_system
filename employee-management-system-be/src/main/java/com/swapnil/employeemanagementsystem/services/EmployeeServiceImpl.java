package com.swapnil.employeemanagementsystem.services;

import com.swapnil.employeemanagementsystem.dto.EmployeeDTO;
import com.swapnil.employeemanagementsystem.entity.Employee;
import com.swapnil.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    @Override
    public EmployeeDTO findEmployeeById(String id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        EmployeeDTO employeeDTO = new EmployeeDTO();
        BeanUtils.copyProperties(employee.get(), employeeDTO);
        return employeeDTO;
    }

    @Override
    public List<EmployeeDTO> findAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map(employee -> new EmployeeDTO(employee.getId(),
                employee.getFirstName(), employee.getLastName(), employee.getEmail())).collect(Collectors.toList());
    }
}
