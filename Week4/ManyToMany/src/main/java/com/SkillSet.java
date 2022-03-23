package com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class SkillSet {
@Id
private int skillId;
private String skillName;
@ManyToMany
private List<EmployeeDetails> empDetails;

}
