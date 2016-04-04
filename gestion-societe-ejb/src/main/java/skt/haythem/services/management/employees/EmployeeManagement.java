package skt.haythem.services.management.employees;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import skt.haythem.domain.Employee;


@Stateless
@LocalBean
public class EmployeeManagement implements EmployeeManagementRemote, EmployeeManagementLocal {

	@PersistenceContext(unitName="gestion-societe-ejb")
    EntityManager entityManager;
    public EmployeeManagement() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public Boolean addEmployee(Employee employee) {
		try {
			entityManager.persist(employee);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean updateEmployee(Employee employee) {
		try {
			entityManager.merge(employee);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Boolean deleteEmployee(Employee employee) {
		try {
			entityManager.remove(entityManager.merge(employee));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public Employee findEmployeeById(Integer idEmployee) {
		Employee employee = null;
		try {
			employee = entityManager.find(Employee.class, idEmployee);
			
		} catch (Exception e) {
			
		}
		return employee;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findAllEmployees() {
		Query query = entityManager.createQuery("select e from Employee e");
		return query.getResultList();
	}

}
