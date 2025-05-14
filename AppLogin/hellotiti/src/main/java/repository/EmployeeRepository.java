/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import enity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author MSI2022
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
