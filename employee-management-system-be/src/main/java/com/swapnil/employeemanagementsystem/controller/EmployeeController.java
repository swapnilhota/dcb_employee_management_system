package com.swapnil.employeemanagementsystem.controller;

import com.swapnil.employeemanagementsystem.dto.EmployeeDTO;
import com.swapnil.employeemanagementsystem.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.createEmployee(employeeDTO);
    }

    @GetMapping(path = "/{employeeId}")
    public EmployeeDTO getEmployee(@PathVariable("employeeId") String id) {
        return employeeService.findEmployeeById(id);
    }
}
