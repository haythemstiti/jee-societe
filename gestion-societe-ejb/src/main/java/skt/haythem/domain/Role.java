package skt.haythem.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import skt.haythem.domain.RolePK;

/**
 * Entity implementation class for Entity: Role
 *
 */
@Entity
@Table(name="t_role")

public class Role implements Serializable {

	
	private String role;
	private RolePK rolePK;
	private Developer developer;
	private Project project;
	
	@ManyToOne
	@JoinColumn(name="idDeveloper",referencedColumnName="id",insertable=false,updatable=false)
	public Developer getDeveloper() {
		return developer;
	}
	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}
	@ManyToOne
	@JoinColumn(name="idProject",referencedColumnName="id",insertable=false,updatable=false)
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}

	private static final long serialVersionUID = 1L;

	public Role() {
		super();
	}   
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}  
	
	@EmbeddedId
	public RolePK getRolePK() {
		return this.rolePK;
	}

	public void setRolePK(RolePK rolePK) {
		this.rolePK = rolePK;
	}
	public Role(String role, Developer developer, Project project) {
		super();
		this.role = role;
		this.developer = developer;
		this.project = project;
		this.rolePK = new RolePK(developer.getId(), project.getId());
	}
   
}
