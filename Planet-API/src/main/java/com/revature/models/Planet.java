package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Hibernate specific annotations. 
// Spring puppets Hibernate, hibernate is what manages our db. 

@Entity
@Table
public class Planet {
	
	@Id //to treat this state as the primary key
	@GeneratedValue(strategy = GenerationType.AUTO) //primary key value will be auto generated!
	private int id;
	
	@Column(name = "planet_name", nullable = false)
	private String name;
	
	@Column
	private double mass;
	
	
	public Planet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Planet(int id, String name, double mass) {
		super();
		this.id = id;
		this.name = name;
		this.mass = mass;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMass() {
		return mass;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", mass=" + mass + "]";
	}
	
	

}
