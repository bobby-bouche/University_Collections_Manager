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
	public void enroll(Student student, String courseCode) {
		if(!studentByCourse.containsKey(courseCode)) {
			throw new IllegalArgumentException("No course with code: " + courseCode);
		}
		if(studentByCourse.get(courseCode).contains(student)) {
			throw new IllegalArgumentException("Student already enrolled in this course");
		}
		studentByCourse.get(courseCode).add(student);
		System.out.println("Student: " + student.getName() + " added to course: " + courseCode);
	}
	
	
	
	public void unenroll(Student student, String courseCode) {
		if(!studentByCourse.containsKey(courseCode)) {
			throw new IllegalArgumentException("No course with code: " + courseCode);
		}
		if(!studentByCourse.get(courseCode).contains(student)) {
			throw new IllegalArgumentException("Student not enrolled in this course");
		}
		studentByCourse.get(courseCode).remove(student);
		System.out.println("Student: " + student.getName() + " has been unenrolled from course: " + courseCode);
	}


}
