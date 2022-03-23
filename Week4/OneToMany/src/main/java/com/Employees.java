package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employees {
@Id
private int eid;
private String empname;
private int epid;

public int getEpid() {
	return epid;
}
public void setEpid(int epid) {
	this.epid = epid;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}

}
