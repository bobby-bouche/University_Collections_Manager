package data;

import enums.Course;
import exceptions.InvalidCourseException;

public class Student extends Person {

	// student fields
	private String course;
	private double gpa;
	
	
	
	// symbolic constants
	private static double DEFAULT_GPA;
	private static double MAX_GPA;
	
	
	
	// initializer
	{
		DEFAULT_GPA = 0.0;
		MAX_GPA     = 4.0;
	}
	
	
	
	
	// consructors
	public Student() {
		super();
	}
	
	public Student(int id, String name, String course, double gpa) {
		super(id, name);
		validateCourse(course);
		this.course = course;
		validateGPA(gpa);
		this.gpa = gpa;
	}

	
	
	// validators
	private static void validateGPA(double gpa) {
		if(gpa < DEFAULT_GPA || gpa > MAX_GPA){
			throw new IllegalArgumentException("Error, Invalid gpa: " + gpa);
		}
	}
	
	
	private static void validateCourse(String course) {
		if(!Course.isValidCourse(course)) {
			throw new InvalidCourseException("Invalid course:" + course);
		}
	}
	
	
	// getters and setters
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		validateCourse(course);
		this.course = course;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		validateGPA(gpa);
		this.gpa = gpa;
	}
	
	
	
	// toString
	@Override
	public String toString() {
		return "Student [course=" + course + ", gpa=" + gpa + "]";
	}
	
}
