package data;

import enums.Course;
import exceptions.InvalidCourseException;
import exceptions.InvalidschoolIDException;

public abstract class Person {

	// fields
	private int school_id;
	private String name;
	private String course;
	
	
	
	//symbolic constants
	private static int MINIMUM_ID_VALUE;
	private static int MAX_ID_VALUE;
	private static int MAX_NAME_LENGTH;
	
	
	
	//initiliazer
	{
		MINIMUM_ID_VALUE = 1000;
		MAX_ID_VALUE     = 5000;
		MAX_NAME_LENGTH  = 50;
	}
	
	
	
	// constructors
	public Person() {
		super();
	}
	
	public Person(int id, String name, String course) {
		super();
		validateId(id);
		this.school_id = id;
		validateName(name);
		this.name = name;
		validateCourse(course);
		this.course = course;
	}
	
	
	
	// validations
	private static void validateId(int id) {
		if(id < MINIMUM_ID_VALUE || id > MAX_ID_VALUE) {
			throw new InvalidschoolIDException("Invalid school id: " + id);
		}
	}
	
	private static void validateName(String name) {
		if(name == null || name.isBlank() || name.length() > MAX_NAME_LENGTH) {
			throw new IllegalArgumentException("Invalid person name: " + name);
		}
	}
	
	private static void validateCourse(String course) {
		if(!Course.isValidCourse(course)) {
			throw new InvalidCourseException("Invalid course:" + course);
		}
	}
	


	
	// getters and setters
	public int getSchool_id() {
		return school_id;
	}
	
	public void setSchool_id(int school_id) {
		validateId(school_id);
		this.school_id = school_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		validateName(name);
		this.name = name;
	}
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		validateCourse(course);
		this.course = course;
	}
	
	
	
	// toString
	@Override
	public String toString() {
		return "Person [school_id=" + school_id + ", name=" + name + ", course=" + course + "]";
	}
	
	
	
	
}
