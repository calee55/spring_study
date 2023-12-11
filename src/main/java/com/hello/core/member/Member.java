package com.hello.core.member;

public class Member {

	private Long id;
	private String name;
	private grade grade;
	
	public Member(Long id, String name, com.hello.core.member.grade grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the grade
	 */
	public grade getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(grade grade) {
		this.grade = grade;
	}

	
}
