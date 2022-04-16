package com.employee.controller;

import com.employee.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Employee firstService(@RequestParam int id) {

        Employee emp = new Employee();
        emp.setName("emp1");
        emp.setDesignation("manager");
        emp.setEmpId(id);
        emp.setSalary(3000);

        return emp;
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public Employee secondService(@RequestBody Employee employee) {

        System.out.println("Inside POST Method");
        Employee emp = new Employee();
        emp.setName(employee.getName());
        emp.setDesignation(employee.getDesignation());
        emp.setEmpId(employee.getEmpId());
        emp.setSalary(employee.getSalary());

        return emp;
    }

}
