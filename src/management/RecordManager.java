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
	
	
	public void remove(T entry) {
		records.remove(entry.getSchool_id());
	}
	
	
	public <T> T find(int id) {
		if(records.containsKey(id)) {
			return (T) records.get(id);
		}
		return null;
	}
	
	
	
	public List<T> all(){
		return new ArrayList<>(records.values());
	}
	
	
}
