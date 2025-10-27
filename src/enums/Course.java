package enums;

import exceptions.InvalidCourseException;

public enum Course {

	// courses
    COMPUTER_SCIENCE ("computer science"),
    MATHEMATICS ("mathematics"),
    PHYSICS("physics"),
    HISTORY("history"),
    ENGINEERING("engineering"),
    BIOLOGY("biology"),	
    ECONOMICS("economics");
	
	
	
	// course variable 
	private String course;
	
	
	
	// constructor
	Course(String course){
		validateCourse(course);
		this.course = course;
	}


	
	// getter and setter
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		validateCourse(course);
		this.course = course;
	}
	
	
	
	// validators
	private static void validateCourse(String course) {
		if(!isValidCourse(course)) {
			throw new InvalidCourseException("Invalid course: " + course);
		}
	}
	
	public static boolean isValidCourse(String inputCourse) {
		for(Course course : Course.values()) {
			if(course.course.equalsIgnoreCase(inputCourse)) {
				return true;
			}
		}
		return false;
	}
	
	
}
