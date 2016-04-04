package skt.haythem.domain;

import java.io.Serializable;
import javax.persistence.*;
import skt.haythem.domain.Employee;

/**
 * Entity implementation class for Entity: Director
 *
 */
@Entity
@Table(name="t_director")

public class Director extends Employee implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Director() {
		super();
	}
   
}
