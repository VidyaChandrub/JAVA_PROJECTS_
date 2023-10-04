package Collections;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		LinkedList<String> ll1 = new LinkedList<String>();
		ll1.add("Vidya");
		ll1.add("Bharu");
		ll1.add("Padma");
		
		System.out.println(ll1);
		
		Iterator i = ll1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		ll.add(1200);
		ll.add(100);
		ll.add(600);
		ll.add(300);
		ll.add(1200);
		ll.add(500);
		
		System.out.println(ll);
		
		//Collections.sort(ll);
		Collections.sort(ll, Collections.reverseOrder());
		System.out.println(ll);
		
		Collections.shuffle(ll1);
		Collections.shuffle(ll);
		System.out.println(ll);
		System.out.println(ll1);
		
		
	}

}
