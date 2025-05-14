/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import enity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.EmployeeRepository;

/**
 *
 * @author MSI2022
 */
@Service
@RequiredArgsConstructor
public class EmployeeService {
    
    private final EmployeeRepository employeeRepository;
     
    public Employee postEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
