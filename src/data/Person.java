package data;

import exceptions.InvalidschoolIDException;

public abstract class Person {

	// fields
	private int school_id;
	private String name;
	
	
	
	//symbolic constants
	private static int MINIMUM_ID_VALUE;
	private static int MAX_ID_VALUE;
	
	
	
	//initiliazer
	{
		MINIMUM_ID_VALUE = 1000;
		MAX_ID_VALUE     = 5000;
	}
	
	
	// constructor
	public Person(int id, String name) {
		super();
		validateId(id);
		this.school_id = id;
		validateName(name);
		this.name = name;
	}
	
	
	
	// validations
	private static void validateId(int id) {
		if(id < MINIMUM_ID_VALUE || id > MAX_ID_VALUE) {
			throw new InvalidschoolIDException("Invalid school id: " + id);
		}
	}
	
	private static void validateName(String name) {
		
	}


	
	// getters and setters
	public int getSchool_id() {
		return school_id;
	}
	
	public void setSchool_id(int school_id) {
		validateId(school_id);
		this.school_id = school_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		validateName(name);
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [school_id=" + school_id + ", name=" + name + "]";
	}
	
	
}
