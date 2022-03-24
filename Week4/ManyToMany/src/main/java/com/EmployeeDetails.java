package com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class EmployeeDetails {
@Id
private int id;
private String name;
@ManyToMany
@JoinTable(name = "employee_skillSet",joinColumns = {@JoinColumn(name="id")},inverseJoinColumns = {@JoinColumn(name="skillId")})
private List<SkillSet> skillSet;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<SkillSet> getSkillSet() {
	return skillSet;
}
public void setSkillSet(List<SkillSet> skillSet) {
	this.skillSet = skillSet;
}

}
