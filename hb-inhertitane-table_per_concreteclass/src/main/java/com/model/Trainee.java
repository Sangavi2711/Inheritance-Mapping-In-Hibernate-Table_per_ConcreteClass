package com.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="EMPDATA104")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="iname",column=@Column(name="name")),
})
public class Trainee extends Employee2 {
 private float payperhour;
 private String Contractperiod;
public Trainee(float payperhour, String contractperiod,String name) {
	super(name);
	this.payperhour = payperhour;
	Contractperiod = contractperiod;
}
public Trainee() {
	super();
}
public float getPayperhour() {
	return payperhour;
}
public void setPayperhour(float payperhour) {
	this.payperhour = payperhour;
}
public String getContractperiod() {
	return Contractperiod;
}
public void setContractperiod(String contractperiod) {
	Contractperiod = contractperiod;
}
}
