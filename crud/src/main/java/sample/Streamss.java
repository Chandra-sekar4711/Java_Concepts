package sample;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Streamss {
	
	public static void main(String[] args) {
	
	   int a[] = new int[] {1,2,3,4,5};
	   Stream i = Arrays.stream(a).boxed();
	   i.forEach(System.out::print);
	   System.out.println();
	   String s[] = new String[] {"chandra","raja","Balaji"};
	   Stream<String> res =Arrays.stream(s);
	   res.forEach(System.out::println);
	   
	   List<Integer> i1 = new ArrayList<>();
	   i1.add(10);
	   i1.add(20);
	   i1.stream().forEach(System.out::println);
	   
	   Stream.of(List.of("chndrasekar"),List.of("Rajasekar"),List.of("Balaji"));
	   
	   Stream<Map<Integer,String>> hm = Stream.of(Map.of(1,"chandra"),Map.of(2,"raja"),Map.of(3,"Balaji"));
	   List l =  hm.flatMap(n->n.entrySet().stream()).collect(Collectors.toList());
	   System.out.println(l);
//	   
	   Stream<Map<Integer,String>> hm1 = Stream.of(Map.of(1,"chandra"),Map.of(2,"raja"),Map.of(3,"Balaji"));
	   List al = hm1.flatMap(n->n.values().stream()).collect(Collectors.toList());
	   System.out.println(al);
	   
	   Stream<Map<Integer,String>> hm2 = Stream.of(Map.of(1,"chandra"),Map.of(2,"raja"),Map.of(3,"Balaji"));
	   List l2 =  hm2.flatMap(n->n.keySet().stream()).collect(Collectors.toList());
	   System.out.println(l2);
	   
	 }
	
	}



