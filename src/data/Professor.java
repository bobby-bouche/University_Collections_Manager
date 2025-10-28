package data;

public class Professor extends Person {

	// professor fields
	private String rank;
	
	
	// symbolic constants
	
	

	// constructors
	public Professor() {
		super();
	}
	
	public Professor(int id, String name, String course, String rank) {
		super(id,name, course);
		validateRank(rank);
		this.rank = rank;
	}
	
	
	
	// validators
	private static void validateRank(String rank) {
		
	}
	
	
	
	// getters and setters	
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
		return "Professor [rank=" + rank + "]";
	}

	
}
