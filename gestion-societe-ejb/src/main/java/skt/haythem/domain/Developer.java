package skt.haythem.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

import skt.haythem.domain.Employee;

/**
 * Entity implementation class for Entity: Developer
 *
 */
@Entity
@Table(name="t_developer")

public class Developer extends Employee implements Serializable {

	
	private String matricule;
	private List<Role> roles;
 	private static final long serialVersionUID = 1L;

	public Developer() {
		super();
	}   
	public String getMatricule() {
		return this.matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	
	@OneToMany(mappedBy="developer")
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
   
}
