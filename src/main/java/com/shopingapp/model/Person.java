package com.shopingapp.model;

public class Person {
	private int id;
	private String name;
    private String job;
    private boolean gender;
    private String password;

	public Person() {
		super();
	}

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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public Person(int id, String name, String job, boolean gender, String password) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.password = password;
	}

}	