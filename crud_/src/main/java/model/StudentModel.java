package model;

import java.util.Date;

public class StudentModel {
	private int studentID;
	private String name;
	private String gender;
	private Date dob;

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public StudentModel(int studentID, String name, String gender, Date dob) {

		this.studentID = studentID;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
	}

	public StudentModel() {

	}

}
