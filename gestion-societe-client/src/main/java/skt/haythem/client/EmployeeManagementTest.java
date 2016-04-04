package skt.haythem.client;

import java.util.Hashtable;

import javax.naming.Binding;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.Name;
import javax.naming.NameClassPair;
import javax.naming.NameParser;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;

import skt.haythem.domain.Employee;
import skt.haythem.services.management.employees.EmployeeManagementRemote;

public class EmployeeManagementTest {
	
	static EmployeeManagementRemote remote;
	
	public static void doAddEmployee(EmployeeManagementRemote remote){
		Employee employee = new Employee();
		employee.setCin("6969");
		employee.setFirstName("Foulen");
		if(remote.addEmployee(employee))
			System.out.println("Ok");
		else
			System.out.println("error");
		
	}
	
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			remote = (EmployeeManagementRemote)context.lookup("gestion-societe-ejb/EmployeeManagement!skt.haythem.services.management.employees.EmployeeManagementRemote");
			doAddEmployee(remote);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
	}

}
