package com;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
@Id
private int pid;
private String pname;
@OneToOne(cascade = CascadeType.ALL)				// by default fk created with name passport_ppid
@JoinColumn(referencedColumnName = "ppid",name = "ppid_fk")
private Passport passport;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public Passport getPassport() {
	return passport;
}
public void setPassport(Passport passport) {
	this.passport = passport;
}

}
