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

}
