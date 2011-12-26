package com.nks.core.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TestEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private long id;
	private String testString ;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTestString() {
		return testString;
	}
	public void setTestString(String testString) {
		this.testString = testString;
	}
}
