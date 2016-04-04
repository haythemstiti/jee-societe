package skt.haythem.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address implements Serializable{

	private static final long serialVersionUID = 1L;
	private String zipCode;
	private String street;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	@Column(name="zip_code")
	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}
