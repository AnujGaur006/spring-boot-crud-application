package com.example.cruddemo.dao;

import com.example.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    // that's it

    //add a method to sort by first name
    //pretty much closer to sql syntax
    public List<Employee> findAllByOrderByFirstNameAsc();
}
