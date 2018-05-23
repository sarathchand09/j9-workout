package com.workout.j9.j9workout.rest;

import com.workout.j9.j9workout.entity.Employee;
import com.workout.j9.j9workout.entity.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepo;

    @PostConstruct
    public void init() {
        employeeRepo.save(new Employee(1L, "gonacalves", "johny", 22, false));
        employeeRepo.save(new Employee(2L, "rehman", "bullet", 25, true));
        employeeRepo.save(new Employee(3L, "goku", "kakarot", 24, true));

        employeeRepo.findAll().forEach(System.out::println);
    }

    @GetMapping(value = "/employee/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    Employee getEmployeeByID(@PathVariable("id") final Long employeeId) {
        return employeeRepo.findById(employeeId).get();
    }
}
