package Java_Concepts;

import java.util.Arrays;
import java.util.SortedMap;

public class stringss {
    public static void main(String[] args) {
        String s = "chandrasekar";
        System.out.println(s);

        String up = s.toUpperCase();
        System.out.println(up);

        String l = "ABCDEFGHI";
        String low  = l.toLowerCase();
        System.out.println(low);

        String c = "chan";
        System.out.println(c);

        char ch = c.charAt(0);
        System.out.println(ch);

        String in = "abc";
        String ind1 = in.indent(3);
        System.out.println(ind1.length());

        String s1 = "sekar";
        String s2 = new String("sekar");
        System.out.println(s1==s2);

       String s22 = s2.intern();
        System.out.println(s1==s22);

        String ss = "happy marriage Life";
        String e[] = ss.split(" ");
        System.out.println(e[2]);

        String ss1 = "helloworld";
        char ch1[] = ss1.toCharArray();
        System.out.println(Arrays.toString(ch1));

        int dd = 1000;
        String yy = String.valueOf(dd);
        System.out.println(yy+1);

        String gg = "Balaji";
        String subres = gg.substring(0,gg.length()-1);
        System.out.println(subres);

        String h = "vinoth|dharmapuri";
        String hj = h.replace("|" ,",");
        System.out.println(hj);

        String j= "rajsekar";
        System.out.println(j.equalsIgnoreCase("rajasekar"));

        boolean b = j.isEmpty();
        System.out.println(b);

        String str = "   space   ";
        String strres = str.stripLeading();
        System.out.println(strres);

        String strtrail= str.stripTrailing();
        System.out.println(strtrail);

        String strresult = str.strip();
        System.out.println(strresult);

        String rep = "Happy";
        String repres = rep.repeat(3);
        System.out.println(repres);

        String strindex = "bala chandrasekar chandrasekar bala";
        int ires = strindex.indexOf("bala");
        System.out.println(ires);

        int lres = strindex.lastIndexOf("bala");
        System.out.println(lres);

        String kk = "may god bless you soon";
        int iress = kk.indexOf("y");
        System.out.println(iress);

        //============================  StringBuffer  ==============================

        StringBuilder sb = new StringBuilder();
        sb.append("chandrasekar");
        sb.append("Rajasekar");
        sb.append("Balaji");
        System.out.println(sb);

        sb.replace(21,sb.length(),"balajiperiyasami");
        System.out.println(sb);

        sb.delete(0,11);
        System.out.println(sb);

        sb.deleteCharAt(0);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        StringBuilder hf =  new StringBuilder("hi hello world");
        hf.insert(3,"hi ");
        System.out.println(hf);

        String fu = "Chnadrasekar";
        boolean gr = fu.startsWith("C");
        System.out.println(gr);

        String fu1 = "Chnadrasekar";
        boolean gr1 = fu.endsWith("C");
        System.out.println(gr1);

        char c1 ='1';
        System.out.println(c1);

        int inn = c1;
        System.out.println(inn);

        char innres = (char)inn;
        System.out.println(innres+1);









    }
}
