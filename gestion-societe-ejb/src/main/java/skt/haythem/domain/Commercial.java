package skt.haythem.domain;

import java.io.Serializable;
import javax.persistence.*;
import skt.haythem.domain.Employee;

/**
 * Entity implementation class for Entity: Commercial
 *
 */
@Entity
@Table(name="t_commercial")

public class Commercial extends Employee implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Commercial() {
		super();
	}
   
}
