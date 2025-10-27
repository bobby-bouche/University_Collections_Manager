package enums;

import exceptions.InvalidRankException;

public enum ProfessorRank {
	
	// enum values
	ASSISTANT_PROFESSOR ("assistant professor"),
	ASSOCIATE_PROFESSOR ("associate professor"),
	FULL_PROFESSOR ("full professor");
	
	
	
	// fields
	private String rank;


	
	// constructor
	ProfessorRank(String rank) {
		validateRank(rank);
		this.rank = rank;
	}
	
	
	
	// getters and setters
	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		validateRank(rank);
		this.rank = rank;
	}
	
	
	
	// validators
	private static void validateRank(String rank) {
		if(!isValidRank(rank)) {
			throw new InvalidRankException("Invalid professor rank: " + rank);
		}
	}
	
	
    // method that takes String input and validates for valid enum value match
	public static boolean isValidRank(String inputRank) {
		for(ProfessorRank rank : ProfessorRank.values()) {
			if(rank.rank.equalsIgnoreCase(inputRank)) {
				return true;
			}
		}
		return false;
	}
	

}
