package org.Riccardo.controllers;

import org.Riccardo.DTO.EmployeeDTO;
import org.Riccardo.models.Employee;
import org.Riccardo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.Riccardo.services.EmployeeRepository;

import java.util.Date;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private EmployeeService employeeService;

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        String html = "";
        html += "<ul>";
        html += " <li><a href='/nuovo'>Test Insert</a></li>";
        html += " <li><a href='/showAllEmployee'>Show All Employee</a></li>";
        html += " <li><a href='/showFullNameLikeTom'>Show All 'Tom'</a></li>";
        html += " <li><a href='/deleteAllEmployee'>Delete All Employee</a></li>";
        html += "</ul>";
        return html;
    }

    @ResponseBody
    @GetMapping(value="/nuovo")
    public String addEmployee(){
        String html = "";
        html += "<form method='POST' action ='/insert'>"+
                "<label>Codice</label><input type='text' name='code' />"+
                "<label>Nome</label><input type='text' name='fullname' />" +
                "<label>Data</label><input type='date' name='startdate' />" +
                "<input type = 'submit' />" +
                "</form>";
        return html;
    }

    @ResponseBody
    @PostMapping("/insert")
    public String testInsert(@ModelAttribute EmployeeDTO employeeDTO) {
        Employee employee = employeeService.save(employeeDTO);


        return "Inserted" + employeeDTO.getFullName();
    }
}


