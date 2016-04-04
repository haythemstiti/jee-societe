package skt.haythem.services.management.employees;

import java.util.List;

import javax.ejb.Remote;

import skt.haythem.domain.Employee;

@Remote
public interface EmployeeManagementRemote {

	Boolean addEmployee(Employee employee);
	Boolean updateEmployee(Employee employee);
	Boolean deleteEmployee(Employee employee);
	Employee findEmployeeById(Integer idEmployee);
	List<Employee> findAllEmployees();
	
}
