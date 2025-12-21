package Java_Concepts;
import java.util.*;

public class Mapp {

    public static void main(String[] args) {
        Map<Integer,String> hm = new HashMap();
        hm.put(1,"Sekar");
        hm.put(2,"balaji");
        hm.put(3,"Raja");
        System.out.println(hm);

        System.out.println(hm.get(2));

        for(int i=1;i<=hm.size();i++)
        {
            System.out.println(hm.get(i));
        }

        hm.replace(2,"Balaji periyasami");
        System.out.println(hm);

        Set keys =hm.keySet();
        System.out.println(keys);

        Collection c = hm.values();
        System.out.println(c);

        Set<Map.Entry<Integer,String>> entry = hm.entrySet();
        System.out.println(entry);

        Iterator<Map.Entry<Integer,String>> i = entry.iterator();
        while(i.hasNext())
        {
            Map.Entry<Integer,String> obj = i.next();
            System.out.println(obj.getKey()+"------->"+obj.getValue());
        }

        Map<Integer,Integer> sec =  new Hashtable<>();
        sec.put(1,1);
        sec.put(2,2);
        sec.put(3,3);
        System.out.println(sec);

        Map<String,Integer> sec1 =  new TreeMap<>();
        sec1.put("sekar",1);
        sec1.put("0",2);
        sec1.put("RajaBalaji",3);
        System.out.println(sec1);


    }
}
