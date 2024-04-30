package com.yuvas.CustomerManagement.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customers_info")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="Name" , nullable=false, length=50)
	private String Name;
	
	@Column(name="Patta_Number", unique = true)
	private long Patta_Number;
	
	@Column(name="Survey_Number", unique = true)
	private long Survey_Number;
	
	@Column(name="Phone_Number")
	private long Phone_Number;
	
	@Column(name="Address", length=450)
	private String Address;

	public Customer() {
		super();
	}

	public Customer(int id, String name, long patta_Number, long survey_Number, long phone_Number, String address) {
		super();
		this.id = id;
		Name = name;
		Patta_Number = patta_Number;
		Survey_Number = survey_Number;
		Phone_Number = phone_Number;
		Address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getPatta_Number() {
		return Patta_Number;
	}

	public void setPatta_Number(long patta_Number) {
		Patta_Number = patta_Number;
	}

	public long getSurvey_Number() {
		return Survey_Number;
	}

	public void setSurvey_Number(long survey_Number) {
		Survey_Number = survey_Number;
	}

	public long getPhone_Number() {
		return Phone_Number;
	}

	public void setPhone_Number(long phone_Number) {
		Phone_Number = phone_Number;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}


}
