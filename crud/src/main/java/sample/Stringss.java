package sample;

import java.util.Arrays;

public class Stringss {
	public static void main(String[] args) {

		String s = "Chandrasekar";
		System.out.println(s);

		String u = s.toUpperCase();
		System.out.println(u);

		String l = s.toLowerCase();
		System.out.println(l);

		System.out.println(s.charAt(7));

		System.out.println(s.length());

		String s1 = "chandrasekar";
		System.out.println(s.equals(s1));

		System.out.println(s.equalsIgnoreCase(s1));

		String s2 = " Rajasekar ";
		System.out.println(s2.length());
		String s22 = s2.strip();
		System.out.println(s22.length());

		String sl = " Baljai     ";
		System.out.println(sl.stripLeading());
		System.out.println(sl.stripTrailing());

		String si = "vishnu";
		System.out.println(si.indent(10));

		String sr = si.repeat(2);
		System.out.println(sr);

		String k = "ramakrishnanram";
		System.out.println(k.indexOf("r"));
		System.out.println(k.lastIndexOf("r"));

		System.out.println(k.isEmpty());
		
		System.out.println(k.contains("ram"));
		
		String tc = "Chandrasekar periyasamichinnasami";
		char[] charr = tc.toCharArray();
		System.out.println(charr);
		
		
		String spp[] = tc.split(" ");
		System.out.println(Arrays.toString(spp));
		System.out.println(spp[1]);
		
	    String res1 =  tc.substring(0,tc.indexOf("p"));
	    System.out.println(res1);
	    
	    int a =12345;
	    String srk = String.valueOf(a);
	    System.out.println(srk+"10");
	    
	    String sa [] = {"abc","def","123"};
	    String jkd = String.join(",", sa);
	    System.out.println(jkd);
	    
	    System.out.println("*****************************");
	    
	    String input = "abc123xyz@#456";
	    String zen = input.replaceAll("\\W", "");
	    System.out.println(zen);
	    
	    
	    
	    
	    
	}

}
