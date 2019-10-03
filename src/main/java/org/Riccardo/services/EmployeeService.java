package org.Riccardo.services;

import org.Riccardo.DTO.EmployeeDTO;
import org.Riccardo.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.util.Date;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee save(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setCode((employeeDTO.getCode()));
        employee.setFullName(employeeDTO.getFullName());
        Date data = Date.from(employeeDTO.getStartDate().atStartOfDay(ZoneId.of("Europe/Rome")).toInstant());
        System.out.println(data);
        employee.setStartDate(data);

        employeeRepository.insert(employee);

        return employee;

    }
}
