package management;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import data.Person;
import exceptions.RecordManagementException;

public class RecordManager<T extends Person> {

	private Map<Integer, T> records = new HashMap<>();
	
	
	
	public void add(T entry) {
		records.put(entry.getSchool_id(), entry);
	}
	
	
	public void remove(T entry) {
		records.remove(entry.getSchool_id());
	}
	
	
	public Person find(int id) {
		if(!records.containsKey(id)) {
			throw new RecordManagementException("Person id: " + id + " not in system");
		}
		return records.get(id);
	}
	
	
	public List<T> all(){
		return new ArrayList<>(records.values());
	}
	
	
	
	// public List<T> search(Predicate<T> p) ??
}
