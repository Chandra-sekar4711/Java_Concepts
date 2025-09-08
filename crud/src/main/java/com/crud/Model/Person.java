package com.crud.Model;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Person {
	
	@Id
	@Column(name="pid")
//	@SequenceGenerator(name = "shared_seq", sequenceName = "global_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer Pid;
	
	@Column(name="pname")
	String name;
	
	@Column(name="page")
	int age;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "cars_fk", referencedColumnName = "pid" )
    @JsonIgnore
	Set<Cars> cars;
   
	
	public Person() {
		
	}
	
	public Person(Integer pid, String name, int age, Set<Cars> cars) {
		super();
		Pid = pid;
		this.name = name;
		this.age = age;
		this.cars = cars;
	}

	public Integer getPid() {
		return Pid;
	}

	public void setPid(Integer pid) {
		Pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set<Cars> getCars() {
		return cars;
	}

	public void setCars(Set<Cars> cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Person [Pid=" + Pid + ", name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}

	
	
	
	
	
	

}
