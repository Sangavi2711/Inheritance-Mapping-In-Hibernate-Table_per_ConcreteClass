package com.model;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="EMPDATA103")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="iname",column=@Column(name="name")),
})
public class RegEmployee extends Employee2 {
	private float salary;
	 private int bonus;
	public RegEmployee(float salary, int bonus,String name) {
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	}
	public RegEmployee() {
		super();
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
 