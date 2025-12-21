package com.crud1.Sample1;

public class Sstring {
    public static void main(String[] args) {

        String s = "Chandrasekar";
        System.out.println(s);
        String s1 = new String("Raja");
        System.out.println(s1);
        String s2[] = new String[]{"one", "two", "Three"};
        System.out.println(s2[0]);
        char ch[] = {'m', 'a', 'n', 'o'};
        String sch = new String(ch);
        System.out.println(sch);

        byte b[] = {'o', 'n', 'e'};
        String s22 = new String(b);
        System.out.println(s22);

        System.out.println("***************Get*******************");
        String li = "Chnadraseakr";
        System.out.println(li.charAt(0));

        int index = li.indexOf('h');
        System.out.println(index);

        int lastindex = li.lastIndexOf('a');
        System.out.println(lastindex);

        System.out.println("***************Update*******************");
        String u = "Balaji Periyasamy";
        String uu = u.replace('y','i');
        System.out.println(uu);
        String u1 = "Balaji Periyasamy bcp";
        String resu1 = u1.replaceAll("bcp","");
        System.out.println(resu1);

        System.out.println("***************Extra *******************");
        String d1 = " BalajiPeriyasamy one  ";
        System.out.println(d1);
        System.out.println(d1.length());

        String sstrip = d1.strip();
        System.out.println(sstrip);
        System.out.println(sstrip.length());

        String sstriplead = d1.stripLeading();
        System.out.println(sstriplead);
        System.out.println(sstriplead.length());

        String sstriptrail = d1.stripTrailing();
        System.out.println(sstriptrail);
        System.out.println(sstriptrail.length());

        System.out.println("Indent");
        String intent = "apple";
        String intres = intent.indent(3);
        System.out.println(intres);

        String h = "abc";
        System.out.println(System.identityHashCode(h));
        String h1 = new String("abc");
        System.out.println(System.identityHashCode(h1));
        System.out.println(h==h1);
        System.out.println(h==h1.intern());

        String rep = "ap";
        String Repeat = rep.repeat(2);
        System.out.println(Repeat);

        System.out.println("************** Important **********");
        String ca = "Chandrasekar";
        char[] cha = ca.toCharArray();
        System.out.println(cha);
        System.out.println(cha[0]);

        String spli = "Chandra sekar";
        String[] splires = spli.split(" ");
        System.out.println(splires[1]);

        int in = 10;
        System.out.println(in+10);
        System.out.println(String.valueOf(in)+10);

        String substr = new String("hi hello world");
        System.out.println("single index->"+substr.substring(4));
        System.out.println("two index->"+substr.substring(4,8));

        System.out.println("**********Additional **********");
        String u11 = "abc";
        System.out.println(u11.toUpperCase());

        String u12 = "ABC";
        System.out.println(u12.toLowerCase());

        System.out.println(u11.isEmpty());

        System.out.println(u12.contains("BC"));

        System.out.println(u11.length());

       String ji[] = {"va","taj","kumar"};
       String jires = String.join("-",ji);
       System.out.println(jires);

        System.out.println("//==================================================================");

        StringBuilder sb = new StringBuilder("Happy New Year");
        System.out.println(sb);

        sb.append(" buddies");
        System.out.println(sb);

        sb.insert(5,"y");
        System.out.println(sb);

        sb.delete(15,23);
        System.out.println(sb);

        StringBuilder revres = sb.reverse();
        System.out.println(revres);

        sb.deleteCharAt(0);
        System.out.println(sb);

        System.out.println("***************************IMPORTANT*******************************//\n");

        String k1 ="keshav";
        String k2 = "keshav";
        System.out.println(k1.equals(k2));

        //CompareTO
        String b1 = "B";
        String b2 = "A";
        int w1 = b1.compareTo(b2);
        System.out.println(w1);























    }
}
