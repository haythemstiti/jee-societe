package skt.haythem.domain;

import java.util.List;
import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Skill
 *
 */
@Entity
@Table(name="t_skill")

public class Skill implements Serializable {

	
	private Integer id;
	private String label;
	private static final long serialVersionUID = 1L;
	
	private List<Employee> employees;

	public Skill() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	@ManyToMany(mappedBy="skills")
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
   
}
