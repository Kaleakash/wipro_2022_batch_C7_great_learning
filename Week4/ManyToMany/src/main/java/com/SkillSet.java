package com;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class SkillSet {
@Id
private int skillId;
private String skillName;
@ManyToMany(cascade = CascadeType.ALL)
private List<EmployeeDetails> empDetails;
public int getSkillId() {
	return skillId;
}
public void setSkillId(int skillId) {
	this.skillId = skillId;
}
public String getSkillName() {
	return skillName;
}
public void setSkillName(String skillName) {
	this.skillName = skillName;
}
public List<EmployeeDetails> getEmpDetails() {
	return empDetails;
}
public void setEmpDetails(List<EmployeeDetails> empDetails) {
	this.empDetails = empDetails;
}

}
