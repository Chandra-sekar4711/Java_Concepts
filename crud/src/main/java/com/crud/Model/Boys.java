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
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Boys {
	
	@Id
	@Column(name="boyid")
//	@SequenceGenerator(name = "shared_seq", sequenceName = "global_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer boyid;
	
	@Column(name="bname")
	String bame;
	
	@Column(name="bage")
	String bage;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="bgFK",
	joinColumns = @JoinColumn(name="bfk"),
	inverseJoinColumns = @JoinColumn(name="gfk"))
    Set<Girls> girls;
	
	public Boys() {
		
	}

	public Boys(Integer boyid, String bame, String bage, Set<Girls> girls) {
		super();
		this.boyid = boyid;
		this.bame = bame;
		this.bage = bage;
		this.girls = girls;
	}

	public Integer getBoyid() {
		return boyid;
	}

	public void setBoyid(Integer boyid) {
		this.boyid = boyid;
	}

	public String getBame() {
		return bame;
	}

	public void setBame(String bame) {
		this.bame = bame;
	}

	public String getBage() {
		return bage;
	}

	public void setBage(String bage) {
		this.bage = bage;
	}

	public Set<Girls> getGirls() {
		return girls;
	}

	public void setGirls(Set<Girls> girls) {
		this.girls = girls;
	}

	@Override
	public String toString() {
		return "Boys [boyid=" + boyid + ", bame=" + bame + ", bage=" + bage + ", girls=" + girls + "]";
	}
	
	
	
	
}
