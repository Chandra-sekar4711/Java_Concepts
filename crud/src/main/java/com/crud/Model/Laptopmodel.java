package com.crud.Model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Laptopmodel {
	
	@Id
	@Column(name="Lid")
	int Lid;
	
	@Column(name="Lname")
	String Lname;
	
	@Column(name="Lram")
	int Lram;
	

	
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getLram() {
		return Lram;
	}
	public void setLram(int lram) {
		Lram = lram;
	}

	
	@Override
	public String toString() {
	    return "Laptopmodel [Lid=" + Lid + ", Lname=" + Lname + ", Lram=" + Lram + "]";
	}

	
	
	

}


