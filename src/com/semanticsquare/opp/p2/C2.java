package com.semanticsquare.opp.p2;

public class C2 {
	private long staffId;
    private int yearsOfExperience ;
    private String description ;
    private double salary;
    private long nurseId;
		// add rest of the getters & setters
	public long getStaffId() {
		return staffId;
	}
	public long getNurseId() {
		return nurseId;
	}
	public void setNurseId(long nurseId) {
		this.nurseId = nurseId;
	}
	public void setStaffId(long staffId) {
		this.staffId = staffId;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	  private long doctorId;
	    public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
		private String specialization;
	
}
