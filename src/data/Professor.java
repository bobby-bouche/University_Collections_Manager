package data;

public class Professor extends Person {

	// professor fields
	private String subject;
	private String rank;
	
	
	// symbolic constants
	
	
	
	// constructors
	public Professor() {
		super();
	}
	
	public Professor(int id, String name, String subject, String rank) {
		super(id,name);
		validateSubject(subject);
		this.subject = subject;
		validateRank(rank);
		this.rank = rank;
	}
	
	
	
	// validators
	private static void validateSubject(String subject) {
		
	}
	
	private static void validateRank(String rank) {
		
	}
	
	
	// getters and setters
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		validateSubject(subject);
		this.subject = subject;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setRank(String rank) {
		validateRank(rank);
		this.rank = rank;
	}

	
	
	// toString
	@Override
	public String toString() {
		return "Professor [subject=" + subject + ", rank=" + rank + "]";
	}

	
}
