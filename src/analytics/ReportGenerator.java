package analytics;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import management.RecordManager;

public class ReportGenerator {
	
	RecordManager students = new RecordManager();
	
	/*
	 *   must implement following
	 * 
	 * - Top N students overall by GPA
	 * - Average GPA per course
	 * - Most popular course(s)
	 * - Search: find students by partial name (case-insensitive) using streams
	 * 
	 */
	
	// fields
	
	
	
	// constructor
	public ReportGenerator() {
		super();
	}
	
	
	public void mostPopularCourse() {
		
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Student> topStudents(int num){
		//kb.validateInt(num);
		List<Student> topRated = (List<Student>) students.all().stream().sorted(Comparator.comparingDouble(Student::getGpa).reversed()).limit(num).collect(Collectors.toList());
		return topRated;
	}
}
