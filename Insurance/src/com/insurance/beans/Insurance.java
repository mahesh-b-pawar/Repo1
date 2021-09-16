package com.insurance.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Insurance {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String cnum;
	@Column
	private String ctype;
	@Column
	private String dob;
	@Column
	private String mob;
	@Column
	private String address;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String email;
	@Column
	private String city;
	@Column
	private String nation;
	@Column
	private String paymentnum;
	

	public String getCnum() {
		return cnum;
	}
	public void setCnum(String cnum) {
		this.cnum = cnum;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getPaymentnum() {
		return paymentnum;
	}
	public void setPaymentnum(String paymentnum) {
		this.paymentnum = paymentnum;
	}
	public Insurance(String cnum2, String ctype, String dob, String mob, String address, String name, String password,
			String email, String city, String nation, String paymentnum2) {
		super();
	
		this.cnum = cnum2;
		this.ctype = ctype;
		this.dob = dob;
		this.mob = mob;
		this.address = address;
		this.name = name;
		this.password = password;
		this.email = email;
		this.city = city;
		this.nation = nation;
		this.paymentnum = paymentnum2;
	}
	public Insurance() {
		super();
	}
	
	
	

}
