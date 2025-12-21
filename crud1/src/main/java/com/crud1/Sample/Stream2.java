package com.crud1.Sample;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {
       //Stream creating from arrays

        Integer a[] = {1,2,3,4,5};
        Stream s =Arrays.stream(a);
        s.forEach(System.out::print);

        int ai[] = {'a','b','c'};
        Stream sr = Arrays.stream(ai).boxed();
        sr.forEach(System.out::print);
        System.out.println();
        int aii[]={11,12};
        IntStream intstr = Arrays.stream(aii);
        intstr.forEach(System.out::println);
        System.out.println("******************************************");

        //Stream creating from Stream
        Stream<String> sfs = Stream.of("Stream1","Stream 2");
        sfs.forEach(n->System.out.println(n));

        List<String> l = List.of("List1","List2","List3");
        Stream<List<String>> slos = Stream.of(l);
        slos.flatMap(List::stream).map(n->n+"added ").forEach(System.out::print);

        //Stream created from collection
        //From list
        List sl = new ArrayList();
        sl.add(11);
        sl.add("Chandrasekar");
       Stream<Object> streamlist = sl.stream();
       streamlist.forEach(n->System.out.print(n));
        System.out.println();

        //From Set
        Set<Integer> set = new HashSet<>();
        set.add(1000);
        set.add(2000);
        set.add(3000);
        List<Integer> soi = set.stream().collect(Collectors.toList());
        System.out.println(soi);

        //Straem from map
        Map<Integer,String> hss = new HashMap<>();
        hss.put(1,"suresh");
        hss.put(2,"Kumar");
        Set<Map.Entry<Integer,String>> hssres = hss.entrySet();
        Map<Integer,String> hssresult = hssres.stream().collect(Collectors.toMap(n->n.getKey(),n->n.getValue()));
        System.out.println(hssresult.get(2));

        System.out.println("****************************************Intermediate operator*********************************");
        //Map
        System.out.println("******************************** Map ***********************");
        //List with map
        List<Integer> lst = new ArrayList();
        lst.add(10);lst.add(20);
        Stream<Integer> lsy = lst.stream();
        lsy.map(n->n*10).forEach(n->System.out.println(n));

        //Set with map
        Set<String> setstr = new HashSet<>();
        setstr.add("vinoth");setstr.add("Kumar");
        setstr.stream().map(n->n.toUpperCase()).forEach(System.out::print);
        System.out.println();
       //Map with map
        Map<Integer,String> km = new HashMap<>();
        km.put(1,"Dhoni");
        km.put(2,"sachin");
        km.put(3,"virat");
        km.put(4,"abraham benjamin develiars");
        //map with entryset
        Set<Map.Entry<Integer,String>> mmap = km.entrySet();
        List<String> yy = mmap.stream().map(n->n.getValue()+"Cricket players").collect(Collectors.toList());
        System.out.println(yy);
        //map with keyset
        Set<Integer> kset = km.keySet();
        kset.stream().map(n->{n.equals(4); return "four";}).forEach(n->System.out.println(n));
        //map with values
       Collection mapcoll = km.values();
       mapcoll.stream().map(n->{if(n.equals("vv"))return "Not present"; else return "present";}).forEach(n->System.out.println(n));

        System.out.println("************************************************FIlter**********************************");
        //List with filter
        List<Integer> ci = List.of(1,2,3,4,5);
        List<Integer> cires = ci.stream().filter(n->n>4).collect(Collectors.toList());
        System.out.println(cires);

        //Set with filter
        Set<String> dw = new HashSet<>();
        dw.add("vikram");
        dw.add("Karthick");
        dw.add("vinoth");
        dw.add("Prabu");
        dw.stream().filter(n-> n.equals("vikram")).map(n->n+"--> Vikram is present ").forEach(System.out::print);

        //Map with filter
        Map<String,String> hmn = new HashMap<>();
        hmn.put("name","chandrasekar");
        hmn.put("age","26");
        hmn.put("job","Java developer");
        System.out.println(hmn);
        Set<Map.Entry<String,String>> hmnres  = hmn.entrySet();
        hmnres.stream().filter(n->n.getValue().equals("Java developer")).map(n->n.getKey()).forEach(System.out::print);
        System.out.println();
        System.out.println("********************************flatmap***********************");

        //List with flatmap
        List<List<String>> llstr = List.of(List.of("Chandra","Sekar","balaji"),List.of("Vinoth","Kumar","balaji"));
        Stream<List<String>> llstrres = llstr.stream();
       llstrres.flatMap(List::stream).map(n->n.toUpperCase()).forEach(n->System.out.print(n+","));
        System.out.println();
       //Palindrome
        List<String> pallist = new ArrayList();
        pallist.add("appa");
        pallist.add("mother");

        List pallistres = pallist.stream().filter(n->n.equals(new StringBuilder(n).reverse().toString())).collect(Collectors.toList());
        System.out.println(pallistres);

        //Set with flatmap
        Set<Set<String>> setsstr = Set.of(Set.of("hi"),Set.of("hello"),Set.of("world"));
        setsstr.stream().flatMap(n->n.stream()).map(n->"Dear "+n).forEach(n->System.out.println(n));

        //Map with flatmap
        Map<String,Map<Integer,String>> pd = Map.of("First",Map.of(1,"Issac",2,"Noah"),"Second",Map.of(1,"mano",2,"pokesh"));
        pd.entrySet().stream().flatMap(n->n.getValue().entrySet().stream()).map(n->n.getValue()).forEach(n->System.out.print(n+", "));

        System.out.println("********************distinct*************************");

        List<String> mm = List.of("Malabar","Kalyam","abc","abc","abc");
        mm.stream().distinct().map(n->"Unique value ---> "+n).forEach(n->System.out.println(n));

        Map<Integer, String> kq = Map.of(1, "chandrasekar", 2, "Rajasekar", 3, "Balaji", 4, "balaji");
        Collection<String> kqc = kq.values();
        String sf = kqc.stream().distinct().max(Comparator.reverseOrder()).get();
        System.out.println(sf);

        System.out.println("**************************************SORT***************************************");
        List<Integer> poj = List.of(23,1,4,0,99,35,63,5);
        //Ascending Order
        poj.stream().sorted(Comparator.naturalOrder()).forEach(n->System.out.print(n));
        System.out.println();
        //Descending Order
        poj.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
        System.out.println("*********************Natural Order*********************");
        //Min
        Integer min = poj.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Min---> "+min);
        //max
        Integer max = poj.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Max---> " + max);
        System.out.println("*********************Reverse Order*********************");
        Integer min1 = poj.stream().min(Comparator.reverseOrder()).get();
        System.out.println("Min---> " + min1);
        Integer max1 = poj.stream().max(Comparator.reverseOrder()).get();
        System.out.println("Max---> " + max1);

        System.out.println("************************peek ****************************************");
        Set<String> setste = new HashSet<>(Set.of("Varun","chak","saisudharson"));
        setste.stream().peek(n->System.out.print(n)).forEach(n->System.out.println());

        System.out.println("************************ Limit  ****************************************");
        List<Integer> vl = new ArrayList<>();
        for(int i=0;i<100;i++)
        {
            vl.add(i);
        }

        vl.stream().limit(10).forEach(n->System.out.print(n+", "));
        System.out.println();
        System.out.println("************************ Skip  ****************************************");
        vl.stream().skip(80).forEach(n->System.out.print(n+", "));

        System.out.println("*********************************Terminator Operator************************");
        System.out.println("*********** Foreach**********");
        //ForEach
        List<String> of = List.of("alpha","Beta","Gamma");
        Stream<String> ofres = of.stream();
        ofres .forEach(n->{List al = new ArrayList(); al.add(n);
            System.out.println(al);});

        System.out.println("*********** toArray **********");
        List<String> los = new ArrayList();
        los.add("Kiran");
        los.add("Aryan");
        Object[] sarray = los.stream().toArray();
        System.out.println(Arrays.toString(sarray));

        System.out.println("*********** Findfirst and FindAny**********");
        //findFirst
        Student s1 = new Student("ITArun",10,"thirunveli","IT");
        Student s2 = new Student("DOCTORRamesh",100,"chennai","Doctor");
        Student s3 = new Student("PILOTSudharson",10,"tanjavur","Pilot");
        List<Student> stud = new ArrayList<>(List.of(s1,s2,s3));
        Student stud1 = stud.stream().findFirst().get();
        System.out.println(stud1);

        Optional<Student> studany = stud.stream().findAny();
        studany.orElseThrow(()->new RuntimeException("Exception No value Present"));

        System.out.println("*******************AnyMatch ,AllMatch,NoneMAtch***************************");
        //AllMatch
        Student ss1 = new Student("ITapple",25,"Kashmir","IT");
        Student ss2 = new Student("DOCTORBall",12,"TamilNadu","Doctor");
        Student ss3 = new Student("IASCat",22,"Egypt","IAS");
        Student ss4 = new Student("ITDog",23,"TamilNadu","IT");
        List<Student> io = new ArrayList<>(List.of(ss1,ss2,ss3,ss4));

        boolean b = io.stream().anyMatch(n->n.getJob().equals("IT"));
        System.out.println(b);

        boolean b1 = io.stream().allMatch(n->n.getAge()>10);
        System.out.println(b1);

        boolean b2 = io.stream().noneMatch(n->n.getAge()<15);
        System.out.println(b2);
        System.out.println("*******************Max min ***************************");
        Student age1 = io.stream().min(Comparator.comparing(n->n.getAge())).get();
        System.out.println(age1);

        Student age2 = io.stream().max(Comparator.comparing(n->n.getAge())).get();
        System.out.println(age2);

        //collect
        System.out.println("*****************************------->//ToList---->Toset--->ToMap*************************");
        List<String> devb = List.of("MCU","LCU","DC","LCU");

        List<String> devblistres = devb.stream().collect(Collectors.toList());
        System.out.println(devblistres);

        Set<String> devbset = devb.stream().collect(Collectors.toSet());
        System.out.println(devbset);

        Map<String,String> devbMap = devb.stream().distinct().collect(Collectors.toMap(n->n,n->n));
        System.out.println(devbMap);

     System.out.println("***************************************** GroupingBy ***********************************");
     List<Student> cgrp = new ArrayList<>(List.of(ss1, ss2, ss3, ss4));
     cgrp.stream().sorted(Comparator.comparing(Student::getAddress)).forEach(n -> System.out.println(n));

     System.out.println("+++++++Group by alone+++++++");
     Map<String, List<Student>> cgrpres = cgrp.stream().sorted(Comparator.comparing(Student::getAddress)).collect(Collectors.groupingBy(Student::getAddress));
     System.out.println(cgrpres);
     System.out.println("***************************************Groupby with mapping********************************");

     Map<String,List<String>> et = cgrp.stream().collect(Collectors.groupingBy(Student::getJob,Collectors.mapping(Student::getName,Collectors.toList())));
     System.out.println(et);

     System.out.println("*************************************** GroupingBy with filtering***********************************");
     // We can also filter before grouping, but the key difference is:
     // if we filter first, elements that don’t match are completely removed.// With filtering() inside grouping, we still keep all groups with Keys ,// but only the matching elements valued remain in each group.
     List<List<Student>> lliststudent = List.of(List.of(ss1,ss2),List.of(ss3,ss4));
     Map<String,List<Student>> tf = lliststudent.stream().flatMap(n->n.stream()).collect(Collectors.groupingBy(Student::getJob,Collectors.filtering(n->n.getAge()>20,Collectors.toList())));
     System.out.println(tf);
     Map<String,List<Student>> tf1 = lliststudent.stream().flatMap(n->n.stream()).filter(n->n.getAge()>20).collect(Collectors.groupingBy(Student::getJob,Collectors.toList()));
     System.out.println(tf1);

     System.out.println("*************************************** GroupingBy with Counting ***********************************");
     Map<String, Long> rescount = lliststudent.stream().flatMap(List::stream).collect(Collectors.groupingBy(Student::getJob,Collectors.counting()));
     System.out.println(rescount);

     System.out.println("*******************  Partitioning **********************************");
     Student se1 = new Student("seakr",25,"pochampalli","IT");
     Student se2 = new Student("Gokul",24,"Rameshwaram","IT");
     Student se3 = new Student("Vicky",26,"Kadallur","IT");
     Student se4 = new Student("Agnash",23,"Kanyakumari","Petrolem industry");
     Student se5 = new Student("Thiru",28,"Dubai","Business");
     Student se6 = new Student("Suriys",26,"Bangalaor","Business");

     List<Student> lop = List.of(se1,se2,se3,se4,se5,se6);
     Map<String,List<String>> lopres = lop.stream().collect(Collectors.groupingBy(Student::getJob,Collectors.mapping(Student::getName,Collectors.toList())));
     System.out.println(lopres);

     Map<Boolean, List<Student>>  partres = lop.stream().collect(Collectors.partitioningBy(n->n.getJob().equals("IT")));
     List<Student> rew = partres.get(true);
     System.out.println(rew);

     System.out.println("*******************  Joining  **********************************");
     Map<String,String> nn = lop.stream().collect(Collectors.groupingBy(Student::getJob,Collectors.mapping(Student::getName,Collectors.joining(","))));
     System.out.println(nn);

     System.out.println("*****************************Stream To Parallel Stream ************************************************");

     List<String> mano = List.of("Apple","Ball","carrot");
     Stream<String> sstring = mano.stream();
     sstring.forEach(System.out::print);

     List<String> mano1 = List.of("Apple","Ball","carrot");
     Stream<String> sstring1 = mano1.parallelStream();

     System.out.println();
     //Stream to paralle straem
     List<String>  df = mano.stream().parallel().collect(Collectors.toList());
     System.out.println(df);

     //paralle stream to Stream
     mano1.parallelStream().sequential().forEach(System.out::print);

     System.out.println("***************************************************************************************************\n");
     //Programs
     Student stu1 = new Student("seakr",25,"pochampalli","IT");
     Student stu2 = new Student("Gokul",24,"Rameshwaram","IT");
     Student stu3 = new Student("Vicky",26,"Kadallur","IT");
     Student stu4 = new Student("Agnash",23,"Kanyakumari","Petrolem industry");
     Student stu5 = new Student("Thiru",28,"Dubai","Business");
     Student stu6 = new Student("Suriys",26,"Bangalaor","Business");

     //Find total highest salary for each department
     List<Student> jk =List.of(stu1,stu2,stu3,stu4,stu5,stu6);
     Map<String,Integer> mn = jk.stream().collect(Collectors.groupingBy(Student::getJob,Collectors.summingInt(Student::getAge)));
     System.out.println(mn);

     Map.Entry<String, Integer> maxEntry = mn.entrySet()
             .stream()
             .max(Map.Entry.comparingByValue())
             .orElseThrow();

     System.out.println("Department with max value: " + maxEntry.getKey() + " -> " + maxEntry.getValue());


     //2nd Question
     List<List<Integer>> listOfLists = Arrays.asList(
             Arrays.asList(1, 5, 3),
             Arrays.asList(7, 2, 9),
             Arrays.asList(4, 8, 6)
     );
     List<Integer> fd = listOfLists.stream().flatMap(n->n.stream()).sorted().collect(Collectors.toList());
     System.out.println(fd);



     //3rd non repeted char in string
//     String input = "swiss";
//     input

     //4 Partition employees by salary threshold

     Map<Boolean,List<Student>> lk = jk.stream().collect(Collectors.partitioningBy(n->n.getAge()>20));
     System.out.println(lk);

     //5: Average Age of IT Department ******* IMportatnt
     Map<String,IntSummaryStatistics> dm = jk.stream().collect(Collectors.groupingBy(Student::getJob,Collectors.summarizingInt(Student::getAge)));
     System.out.println(dm.get("IT").getAverage());


















































































    }
}
