package management;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import data.Student;

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
	public void enroll(int studentId, String courseCode) {
		if(studentByCourse.containsKey(courseCode)) {
			// TODO search through list to find student
		}
	}
	
	
	public void unenroll(int studentId, String courseCode) {
		
	}


}
