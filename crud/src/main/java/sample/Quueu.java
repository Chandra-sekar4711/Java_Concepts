package sample;
import java.util.*;

public class Quueu {
  
	public static void main(String[] args) {
		Queue<String> q = new LinkedList();
		q.add("sekar");
		q.add("sekar");
		q.add("balaji");
		q.add("chandra");
		
		System.out.println(q);
		
		System.out.println(q.peek());
		
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q);
		
		
		Iterator ii = q.iterator();
		while(ii.hasNext())
		{
	        System.out.println(ii.next());
		}
		
		
	}
	
}
