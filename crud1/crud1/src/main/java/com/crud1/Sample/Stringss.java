package com.crud1.Sample;

import java.util.Arrays;


public class Stringss {
    public static void main(String[] args) {
        String s = "chandrasekar";
        System.out.println(s);

        String s1 = new String(" abc ");
        System.out.println(s1);

        char cr = s.charAt(2);
        System.out.println(cr);

        System.out.println(s.length());

        String su = s.toUpperCase();
        System.out.println(su);

        String sl = su.toLowerCase();
        System.out.println(sl);

        String si = s.indent(10);
        System.out.println(si);

        String ss = si.strip();
        System.out.println(ss);

        System.out.println(s1.length());

        String sll = s1.stripLeading();
        System.out.println(sll.length());

        String st = sll.stripTrailing();
        System.out.println(st.length());

        char ca[] = s.toCharArray();
        System.out.println(Arrays.toString(ca));

        String s2 = "hi hello world hi";
        String sa[] =  s2.split(" ");
        System.out.println(sa[2]);

        int i= 10;
        String sv = String.valueOf(i);
        System.out.println(sv+10);

        String sr = sv.repeat(2);
        System.out.println(sr);

        String srr = s2.replace('h','w');
        System.out.println(srr);

        String ra = s2.replaceAll("hi","Hii");
        System.out.println(ra);

        String ssp = ra.substring(0,12);
        System.out.println(ssp);

        int resi = ssp.indexOf('o');
        System.out.println(resi);

        int resli = ssp.lastIndexOf('o');
        System.out.println(resli);

        int sio = ssp.indexOf("wo");
        System.out.println(sio);

        String p = "Balaji";
        String p1 = "balaji";
        System.out.println(p.equals(p1));
        System.out.println(p.equalsIgnoreCase(p1));

        boolean be = p1.isEmpty();
        System.out.println(be);

        boolean bee = p1.contains("ji");
        System.out.println(bee);

        String h = "sekar";
        String h1 = new String("sekar");
        System.out.println("*******************");
        String h2 = h1.intern();
        System.out.println(h==h2);

        System.out.println(h.startsWith("s"));

        System.out.println(h.endsWith("r"));

        StringBuffer sb = new StringBuffer("String buffer objectts ");
        System.out.println(sb);

        StringBuilder sbb = new StringBuilder("String Builder obj");
        System.out.println(sbb);

        sb.append("chandrasekar");
        System.out.println(sb);

        sb.insert(7,"classs");
        System.out.println(sb);

        sb.deleteCharAt(5);
        System.out.println(sb);

        sb.delete(18,27);
        System.out.println(sb);

        sb.replace(0,5,"sekar");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        String[] f = {"balajii","is","an","good","boy"};
        String fres = String.join(" ",f);
        System.out.println(fres);


    }
}

