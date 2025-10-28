package management;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import data.Person;

public class RecordManager<T extends Person> {

	private Map<Integer, T> records = new HashMap<>();
	
	
	
	public void add(T entry) {
		records.put(entry.getSchool_id(), entry);
	}
	
	
	
	public List<T> all(){
		return new ArrayList<>(records.values());
	}
	
	
}
