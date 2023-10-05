package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		LinkedHashSet ls = new LinkedHashSet();
		
		hs.add("Vidya");
		hs.add(100);
		hs.add(299);
		hs.add(100);
		hs.add("bharu");
		hs.add(false);
		
		System.out.println(hs);
		
		ls.add(10);
		ls.add(50);
		ls.add(60);
		ls.add(30);
		ls.add(20);
		ls.add(40);
		ls.add(70);
		
		//ls.addAll(hs);
		
		
		System.out.println(ls);		
		//ls.removeAll(hs);
		
		List list = new ArrayList(ls);
		Collections.sort(list);
		System.out.println(list);		

	}

}
