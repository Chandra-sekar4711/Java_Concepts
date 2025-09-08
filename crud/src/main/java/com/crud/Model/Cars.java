package com.crud.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Cars {
	
	 @Id
//	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shared_seq")
//	 @SequenceGenerator(name = "shared_seq", sequenceName = "global_seq", allocationSize = 1)
	 @Column(name="cid")
	Integer cid;
	
	@Column(name="cname")
	String cname;
	
	@Column(name="cprice")
	int cprice;
	
	public Cars()
	{}

	public Cars(Integer cid, String cname, int cprice) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cprice = cprice;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCprice() {
		return cprice;
	}

	public void setCprice(int cprice) {
		this.cprice = cprice;
	}

	@Override
	public String toString() {
		return "Cars [cid=" + cid + ", cname=" + cname + ", cprice=" + cprice + "]";
	}
	
	

}