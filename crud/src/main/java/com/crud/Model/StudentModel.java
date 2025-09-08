package com.crud.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class StudentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shared_seq")
	@SequenceGenerator(name = "shared_seq", sequenceName = "global_seq", allocationSize = 1)
	@Column(name="sid")
	int sid;
	@Column(name="sname")
	String sname;
	@Column(name="sdept")
	String sdept;
	@Column(name="smark")
	int smark;
	@Column(name="spno")
	int sphno;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aid_fk", referencedColumnName = "aid" ) // Foreign key to Laptopmodel's primary key
    private Addressmodel address;
	
   @ManyToOne
	@JoinColumn(name = "lid_FK")
	Laptopmodel lid_FK;
	
   public StudentModel()
   {}
   
   

public StudentModel(int sid, String sname, String sdept, int smark, int sphno, Addressmodel address,
		Laptopmodel lid_FK) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.sdept = sdept;
	this.smark = smark;
	this.sphno = sphno;
	this.address = address;
	this.lid_FK = lid_FK;
}



public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public String getSdept() {
	return sdept;
}

public void setSdept(String sdept) {
	this.sdept = sdept;
}

public int getSmark() {
	return smark;
}

public void setSmark(int smark) {
	this.smark = smark;
}

public int getSphno() {
	return sphno;
}

public void setSphno(int sphno) {
	this.sphno = sphno;
}

public Addressmodel getAddress() {
	return address;
}

public void setAddress(Addressmodel address) {
	this.address = address;
}

public Laptopmodel getLid_FK() {
	return lid_FK;
}

public void setLid_FK(Laptopmodel lid_FK) {
	this.lid_FK = lid_FK;
}



@Override
public String toString() {
    return "StudentModel [sid=" + sid + ", sname=" + sname + ", sdept=" + sdept + ", smark=" + smark + "]";
}

	
	
	
	

}