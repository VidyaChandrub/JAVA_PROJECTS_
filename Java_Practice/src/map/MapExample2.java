package map;
import java.util.*;

public class MapExample2 {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul");  
		  map.put(102,"Rahul");  
		  System.out.println(map);  
		 System.out.println(map.entrySet());
		

	}

}
