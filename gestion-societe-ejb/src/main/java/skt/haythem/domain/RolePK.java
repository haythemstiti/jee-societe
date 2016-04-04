package skt.haythem.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class RolePK implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int idDeveloper;
	private int idProject;
	
	public RolePK() {
		// TODO Auto-generated constructor stub
	}

	public int getIdDeveloper() {
		return idDeveloper;
	}

	public void setIdDeveloper(int idDeveloper) {
		this.idDeveloper = idDeveloper;
	}

	public int getIdProject() {
		return idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idDeveloper;
		result = prime * result + idProject;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RolePK other = (RolePK) obj;
		if (idDeveloper != other.idDeveloper)
			return false;
		if (idProject != other.idProject)
			return false;
		return true;
	}

	public RolePK(int idDeveloper, int idProject) {
		super();
		this.idDeveloper = idDeveloper;
		this.idProject = idProject;
	}
	



}
