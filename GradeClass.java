package hickman_exam2;

public class GradeClass {
	
	/* Author: Heather Hickman
	Class: CPT 236 H01 Intro to Java Programming
	Description: Exam 2
	Date written: 7/30/2019
	Date last updated: 7/30/2019
	Program name: hickman_exam2.java, GradeClass.java */
	
	
	// VARIABLES
	String studentName;
	double gradeOne, gradeTwo, gradeThree, gradeFour;
	
	// CREATE A CONSTRUCTOR
	public GradeClass () {
		studentName = "";
		gradeOne = 0.0;
		gradeTwo = 0.0;
		gradeThree = 0.0;
		gradeFour = 0.0;
	}
	
	// SETTERS (MUTATORS)
	public void setName(String s) {
		studentName = s;
	}
	
	public void setGOne(double grOne) {
		gradeOne = grOne;
	}
	
	public void setGTwo(double grTwo) {
		gradeTwo = grTwo;
	}
	
	public void setGThree(double grThree) {
		gradeThree = grThree;
	}
	
	public void setGFour(double grThree) {
		gradeFour = grThree;
	}
	
	
	// GETTERS (ACCESSORS)
	public String getName() {
		return studentName;
	}
	
	public double getGradeOne() {
		return gradeOne;
	}
	
	public double getGradeTwo() {
		return gradeTwo;
	}
	
	public double getGradeThree() {
		return gradeThree;
	}
	
	public double getGradeFour() {
		return gradeFour;
	}
	
	

}
