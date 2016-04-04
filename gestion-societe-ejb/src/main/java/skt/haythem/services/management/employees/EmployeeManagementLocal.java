package skt.haythem.services.management.employees;

import java.util.List;

import javax.ejb.Local;

import skt.haythem.domain.Employee;

@Local
public interface EmployeeManagementLocal {

	Boolean addEmployee(Employee employee);
	Boolean updateEmployee(Employee employee);
	Boolean deleteEmployee(Employee employee);
	Employee findEmployeeById(Integer idEmployee);
	List<Employee> findAllEmployees();
}
