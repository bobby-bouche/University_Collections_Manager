package analytics;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import data.Student;
import management.CourseManager;
import management.RecordManager;

public class ReportGenerator {
	
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
	RecordManager<Student> students = new RecordManager<>();
	CourseManager courses = new CourseManager();
	
	
	
	// constructor
	public ReportGenerator() {
		super();
	}
	

	
	// class methods
	public List<Student> topStudents(int num){
		// TODO kb.validateInt(num);
		List<Student> topRated = (List<Student>) students.all().stream()
				.sorted(Comparator.comparingDouble(Student::getGpa)
				.reversed())
				.limit(num)
				.collect(Collectors.toList());
		return topRated;
	}
	
	
	
	public Map<String, Double> avgByCourse(){
		Map<String, Double> avgMap = students.all().stream()
				.collect(Collectors.groupingBy(
						Student::getCourse,
						Collectors.averagingDouble(Student::getGpa)
				));
		return avgMap;
	}
	
	
}
