package com.jsp.person.adhar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.GenerationType;

@Entity


public class Adhar {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private int contact_no;
private String city;


@OneToOne
private Person person;

public int getContact_no() {
	return contact_no;
}

public void setContact_no(int contact_no) {
	this.contact_no = contact_no;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public Person getPerson() {
	return person;
}

public void setPerson(Person person) {
	this.person = person;
}

}
