package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
	
		Map<Integer, String> hm = new HashMap<Integer, String>();
	
		hm.put(10, "Vidya");
		hm.put(20, "prasanna");
		hm.put(30, "chandana");
		hm.put(40, "bharu");
		hm.put(50, "sandya");
		hm.put(60, "sandya");
		
		System.out.println(hm);
		/*
		 * Map hm1 = new HashMap();
		 * 
		 * hm1.putAll(hm); hm1.put(70, "sandya"); System.out.println(hm1);
		 */
		
		/*
		 * System.out.println(hm.get(10));
		 * 
		 * Set s1 = hm.keySet(); // for getting keys System.out.println(s1); Collection
		 * c = hm.values(); //for getting values System.out.println(c);
		 * 
		 * Set s2 = hm.entrySet(); // for converting map into set
		 * System.out.println(s2);
		 */
		
		/*
		 * for(Object obj : s2) { System.out.println(obj);
		 * 
		 * }
		 * 
		 * Iterator i = s2.iterator(); while(i.hasNext()) { Map.Entry m1 = (Map.Entry)
		 * i.next();{
		 * System.out.println(m1.getKey()+":"+m1.getValue()+":"+m1.hashCode()); } }
		 */
		
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		
	}

}
