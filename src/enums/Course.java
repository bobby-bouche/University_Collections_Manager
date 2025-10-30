package enums;

import exceptions.InvalidCourseException;

public enum Course {

	// courses      courseCode
    COMPUTER_SCIENCE ("csc"),
    MATHEMATICS      ("mth"),
    PHYSICS          ("phy"),
    HISTORY          ("hst"),
    ENGINEERING      ("eng"),
    BIOLOGY          ("bio"),	
    ECONOMICS        ("eco");
	
	
	
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
	private static void validateCourse(String courseCode) {
		if(!isValidCourse(courseCode)) {
			throw new InvalidCourseException("Invalid courseCode: " + courseCode);
		}
	}
	
	public static boolean isValidCourse(String courseCode) {
		for(Course course : Course.values()) {
			if(course.course.equalsIgnoreCase(courseCode)) {
				return true;
			}
		}
		return false;
	}
	
	
}
