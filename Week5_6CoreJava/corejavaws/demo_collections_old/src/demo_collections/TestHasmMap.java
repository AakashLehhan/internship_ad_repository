package demo_collections;

import java.util.HashMap;
import java.util.Map;

public class TestHasmMap {

	public static void main(String[] args) {
		Map<Integer,Person> map=new HashMap<>();
		map.put(1, new Person("Preeti"));
		map.put(2, new Person("Preeya"));
		map.put(3, new Person("Preeyanka"));
		map.put(2, new Person("Pratima"));
		map.put(4,null );
		System.out.println(map);
		//Map -> Entry[key=value]
		for(Map.Entry<Integer, Person> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}

}
