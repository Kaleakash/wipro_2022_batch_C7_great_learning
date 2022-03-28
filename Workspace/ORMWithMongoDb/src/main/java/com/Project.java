package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
@Id
private int pid;
private String name;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
