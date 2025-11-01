package management;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import data.Student;
import exceptions.InvalidCourseException;

public class CourseManager {
	
	// properties
	private Map<String, List<Student>> studentByCourse;
	
	
	
	// constructor
	public CourseManager() {
		super();
		studentByCourse = new HashMap<>();
	}
	
	
	
	// getter and setter methods
	public Map<String, List<Student>> getStudentByCourse() {
		return studentByCourse;
	}
	
	
	
	// class methods
	/*
	 * if it doesnt appear, create it. if it does apper, enroll student
	 */
	public void enroll(int studentId, String courseCode) {
		if(!studentByCourse.containsKey(courseCode)) {
			
		}
	}
	
	
	public void unenroll(int studentId, String courseCode) {
		
	}


}
