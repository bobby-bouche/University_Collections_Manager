package enums;

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
		this.setCourse(course);
	}


	
	// getter and setter
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
    // method that takes String input and validates for valid enum value match
	public static boolean validateCourse(String inputCourse) {
		for(Course course : Course.values()) {
			if(course.course.equalsIgnoreCase(inputCourse)) {
				return true;
			}
		}
		return false;
	}
	
	
}
