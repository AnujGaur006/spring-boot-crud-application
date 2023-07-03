package com.example.cruddemo.contoller;

import com.example.cruddemo.entity.Employee;
import com.example.cruddemo.service.EmployeeService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    public EmployeeService employeeService;

    public EmployeeController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    @GetMapping("/list")
    public String listEmployees(Model theModel) {

        List<Employee> theEmployees = employeeService.findAll();
        // add to the spring model
        theModel.addAttribute("employees", theEmployees);

        return "employees/list-employees";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        Employee theEmployee = new Employee();
        // add to the spring model
        theModel.addAttribute("employee", theEmployee);

        return "employees/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee){
        //save the employee
        employeeService.save(theEmployee);

        //use a redirect to prevent duplicate submissions
        return "redirect:/employees/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId") int theId,Model theModel){
        //get the employee from the service
        Employee theEmployee = employeeService.findById(theId);

        //set the employee in the model to repopulate the form
        theModel.addAttribute("employee",theEmployee);

        //send over to our form
        return "employees/employee-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("employeeId") int id){
        //get the employee from the service
        employeeService.deleteById(id);

        return "redirect:/employees/list";

    }
}









