package management;

import java.util.ArrayList;
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
	
	
	
	public void unenroll(int studentId, String courseCode) {
		if(!studentByCourse.containsKey(courseCode)) {
			throw new IllegalArgumentException("No course with code: " + courseCode);
		}
		ArrayList<Student> students = (ArrayList<Student>) studentByCourse.get(courseCode);
		for(Student stu : students) {
			if(stu.getSchool_id() == studentId) {
				throw new IllegalArgumentException("Student already is enrolled in this course");
			}
			else {
				
			}
		}
	}


}
