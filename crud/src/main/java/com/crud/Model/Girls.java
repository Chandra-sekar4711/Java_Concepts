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
public class Girls {
	
	@Id
	@Column(name="Girlid")
//	@SequenceGenerator(name = "shared_seq", sequenceName = "global_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer Girlid;
	
	@Column(name="gname")
	String game;
	
	@Column(name="gage")
	String gage;
	
	public Girls() {}

	public Girls(Integer girlid, String game, String gage) {
		super();
		Girlid = girlid;
		this.game = game;
		this.gage = gage;
	}

	public Integer getGirlid() {
		return Girlid;
	}

	public void setGirlid(Integer girlid) {
		Girlid = girlid;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public String getGage() {
		return gage;
	}

	public void setGage(String gage) {
		this.gage = gage;
	}

	@Override
	public String toString() {
		return "Girls [Girlid=" + Girlid + ", game=" + game + ", gage=" + gage + "]";
	}
	
	

}

