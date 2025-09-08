package sample;
import java.util.*;

public class Sett {
	
	public static void main(String[] args) {
		List al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		System.out.println(al);
		
		Set s = new HashSet(al);
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4.0);
		s.add("Ram");
		s.add(7);
		s.add(8);
		s.add("Vino");
		s.add(9);
		s.add(10);
		System.out.println(s);
		
		String sl ="sss";
		
		
		for(Object res1 :s)
		{
			System.out.println(res1);
		}
		
		s.remove("Vino");
		System.out.println(s);
		
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		System.out.println(s.contains("Ram"));
		System.out.println(!s.equals(4.0));
	
		List<String> l = new ArrayList<>();
		l.add("kamal");
		l.add("Rajini");
		l.add("Rajini");
		
		s.addAll(l);
		System.out.println(s);
		
		
	}

}
