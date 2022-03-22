package com;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Trainer {
@Id
private int tid;				//PK
private String tname;
private String tech;
@OneToMany(mappedBy = "tsid",cascade = CascadeType.ALL)				// FK through trainer object we can do 
												// all oporeation on student object, save, delete, update and retrieve 
private List<Student> listOfStd;

public List<Student> getListOfStd() {
	return listOfStd;
}
public void setListOfStd(List<Student> listOfStd) {
	this.listOfStd = listOfStd;
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
@Override
public String toString() {
	return "Trainer [tid=" + tid + ", tname=" + tname + ", tech=" + tech + "]";
}
public Trainer(int tid, String tname, String tech) {
	super();
	this.tid = tid;
	this.tname = tname;
	this.tech = tech;
}
public Trainer() {
	super();
	// TODO Auto-generated constructor stub
}

}
