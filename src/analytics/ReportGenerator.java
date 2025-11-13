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
	 * - Top N students overall by GPA 														 DONE
	 * - Average GPA per course 															 DONE
	 * - Most popular course(s)																 DONE
	 * - Search: find students by partial name (case-insensitive) using streams              DONE
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
		List<Student> topRated = students
				.all()
				.stream()
				.sorted(Comparator.comparingDouble(Student::getGpa)
				.reversed())
				.limit(num)
				.collect(Collectors.toList());
		return topRated;
	}
	
	
	// method to return the average gpa per course
	public Map<String, Double> avgByCourse(){
		Map<String, Double> avgMap = students
				.all()
				.stream()
				.collect(Collectors.groupingBy(
						Student::getCourse,
						Collectors.averagingDouble(Student::getGpa)
				));
		return avgMap;
	}
	
	
	
	// method to return a map of the number of students for every class
    public String mostPopularCourse() {
    	Map<String, Long> counts = students
    			.all()
    			.stream()
    			.collect(Collectors.groupingBy(Student::getCourse, Collectors.counting()));
    	String mostPopular = counts.entrySet().stream()
    			.max(Map.Entry.comparingByValue())
    			.map(Map.Entry::getKey)
    			.orElse("None");
    	return mostPopular;
    }
	
    
    
    public List<Student> searchByName(String name){
    	List<Student> result = students
    			.all()
    			.stream()
    			.filter(s -> s.getName().toLowerCase().contains(name.toLowerCase()))
    			.collect(Collectors.toList());
    	return result;
    }
}
