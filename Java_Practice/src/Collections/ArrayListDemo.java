package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		List all = new ArrayList();
		
		all.add("bharu");
		all.add(89);
		all.add(8.9);
		// ArrayList is a class which implements List interface it can contain heterogeneous elements and size is dynamically we can add;
		System.out.println("Learning Collection Framework");
		al.add(10);
		al.add("vidya");
		al.add(false);
		al.add(6.5);
		System.out.println(al);
		System.out.println(al.size());
		al.remove(1);
		
		al.addAll(all);
	
			System.out.println(al);
			//System.out.println(al.toArray());
			System.out.println(al.equals(all));
		/*//al.removeAll(all);
			//al.retainAll(all);
			//al.clear();
			System.out.println(al.containsAll(all));
		System.out.println(al);
		System.out.println(all);*/
		
		/*for(int i=0; i<al.size(); i++)
			System.out.println(al(i));*/

	}

}
