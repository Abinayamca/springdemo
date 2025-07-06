package com.demo.pathdemo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="demo")

public class PathModel {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	private String grade;

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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public PathModel(){
	}
	
	public PathModel(int id,String name,String grade)
	{
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "PathModel [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	
}
