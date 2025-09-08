package sample;

import java.util.Arrays;


public class Stringgs {
	
	public static void main(String[] args) {
		String s = " helloWORLD ";
		String up = s.toUpperCase();
		System.out.println(up);
		
		String low = s.toLowerCase();
		System.out.println(low);
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(8));
		
		String str = s.strip();
		System.out.println(str);
		
		String sl = s.stripLeading();
		System.out.println(sl);
		
		String st = s.stripTrailing();
		System.out.println(st);
		System.out.println("******************");
		
		String res =s.indent(10);
		System.out.println(res);
		
		
		String s1 ="chandra sekar";
		System.out.println(s1.equalsIgnoreCase("Chandra sekar"));
		
		
		String ss = "Trent go application marketting";
		String ssres = ss.repeat(2);
		System.out.println(ssres);
		
		String [] res1 = ss.split(" ");
	    System.out.println(Arrays.toString(res1));
	    
	    String substr = ss.substring(0, 7);
	    System.out.println(substr);
	    
	   int a =123;
	   String se = String.valueOf(a);
	   System.out.println(se+"10");
	   
	   String rr = ss.replace('o', 'p');
	   System.out.println(rr);
	   
	   System.out.println(ss.isEmpty());
	   
	   System.out.println(ss.length());
	   
	   System.out.println(rr.contains("gp"));
	   
	   System.out.println(ss.startsWith("Trent"));
		
	   char[] ch = ss.toCharArray();
	   System.out.println(ch);
	   
	   
	   String v = "abc";
	   String vres = "";
	   
	   for(int i=0;i<v.length();i++)
	   {
		   vres = vres+(char)(v.charAt(i)-32);
		   
	   }
		System.out.println(vres);
		
		
		String is = "123";
//		int isres = Integer.parseInt(is);
//		System.out.println(isres+1);
		
		int isres = 0;
		
		for(int i=0;i<is.length();i++)
		{
		     isres = isres*10 + (is.charAt(i)-48);	
		}
		System.out.println(isres+1);
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		StringBuffer sb = new StringBuffer(s);
		
		sb.append("chandra");
		System.out.println(sb);
		
		System.out.println(sb.charAt(sb.length()-1));
		
		sb.replace(12, sb.length()-1, "Raja");
		System.out.println(sb);
		
		sb.delete(12, sb.length());
		System.out.println(sb);
		
		sb.deleteCharAt(sb.indexOf("D"));
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
	   
		}

}
