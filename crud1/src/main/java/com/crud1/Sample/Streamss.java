package com.crud1.Sample;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamss {
    public static void main(String[] args) {
        //Stream creation from Array
        int a[] = {1,2,3,4,5};
        Arrays.stream(a).forEach(System.out::print);
        System.out.println();

        int b[] = {1000,2000};
        Stream ps = Arrays.stream(b).boxed();
        ps.forEach(System.out::print);
        System.out.println();

        //Stream creation from stream
        Stream<String> sstr = Stream.of("chandra","sekar");
        List<String> lres = sstr.collect(Collectors.toList());
        System.out.println(lres.get(0));

        //Stream Creation from Collection
        //From List
        List<Integer> l = new ArrayList<>();
        l.add(201);
        l.add(202);
        l.add(203);
        Stream<Integer> si1 = l.stream();
        si1.forEach(n->System.out.println(n));
        //From set
        Set<String> sd = new HashSet<>();
        sd.add("suriya");
        sd.add("suriya");
        sd.add("Joythika");
        Set<String> setstr =  sd.stream().collect(Collectors.toSet());
        System.out.println(setstr);
        //From Map
        Map<Integer,String> mapstr = new HashMap<>();
        mapstr.put(1,"ZOHO");
        mapstr.put(2,"GOOGLE");
        mapstr.put(3,"AMAZON");
        System.out.println(mapstr);

        Set<Map.Entry<Integer,String>> es = mapstr.entrySet();
        List<String> lstr = es.stream().map(n->n.getValue()+" COMPANY").toList();
        System.out.println(lstr);

        System.out.println("****************************************Intermediate operator*********************************");
        //Map
        System.out.println("********************************///Map***********************");
        //List with map
        List re = List.of(1,2,3,4,5,"Balaji");
        re.stream().map(n->{if(n.equals("Balaji")){return "balaji periyasami";}return n;}).forEach(System.out::println);

        //Set with map
        Set<String> su =new HashSet<>(List.of("rajini","kamal","rajini","Kamal"));
        su.stream().map(n->{
            if(n.equals("rajini"))
            {return "SuperStar "+n;}
            else{return "Ilaganayagan ";}
        }).forEach(n->System.out.println(n));

        //Map with map()
        Map<Integer,String> km = new HashMap<>();
        km.put(1,"Dhoni");
        km.put(2,"sachin");
        km.put(3,"virat");
        km.put(4,"abraham benjamin develiars");

        Set<Map.Entry<Integer,String>> dk = km.entrySet();
        Stream<String> ry = dk.stream().map(n->n.getValue()+" Cricket");
        List<String> rei = ry.collect(Collectors.toList());
        System.out.println(rei);

        Set jj = km.keySet();
        jj.stream().map(n->n).forEach(System.out::print);

        System.out.println();
        Collection cc  =  km.values();
        cc.stream().map(n->{if(n.equals("virat")){return n+" Kholi";}return "";}).forEach(System.out::print);

        System.out.println("************************************************FIlter**********************************");
       //List with filter
        List<Integer> ci = List.of(1,2,3,4,5);
        ci.stream().map(n->n*2).filter(n->n>=6).forEach(n->System.out.println(n));

        //Set with filter
        Set<String> dw = new HashSet<>();
        dw.add("vikram");
        dw.add("Karthick");
        dw.add("vinoth");
        dw.add("Prabu");

        dw.stream().filter(n->{if(n.startsWith("v")){return true;}return false;}).forEach(System.out::print);
        System.out.println();
        //Map with filter
        Map<String,String> hmn = new HashMap<>();
        hmn.put("name","chandrasekar");
        hmn.put("age","26");
        hmn.put("job","Java developer");
        System.out.println(hmn);

        Set<Map.Entry<String,String>> mf = hmn.entrySet();
        mf.stream().map(n->{return "My "+n.getKey()+"is "+n.getValue();}).forEach(System.out::print);

        System.out.println("********************************flatmap***********************");

        //List with flatmap
        List<List<String>> llstr = List.of(List.of("Chandra","Sekar","balaji"),List.of("Vinoth","Kumar","balaji"));
        List<List<String>> js = llstr.stream().map(n-> n.stream().filter(n1->{if(n1.equals("balaji"))return true;
            return false;
        }).collect(Collectors.toList())).collect(Collectors.toList());
        System.out.println(js);

        List<String> ret = llstr.stream().flatMap(List::stream).filter(n->n.equals("balaji")).collect(Collectors.toList());
        System.out.println(ret);

        //Set with flatmap
        Set<Set<Integer>> setstr1 =  Set.of(Set.of(1,2,3),Set.of(4,5,6));
        Set<Integer> sint = setstr1.stream().flatMap(Set::stream).filter(n->n%2==0).map(n->n*2).collect(Collectors.toSet());
        System.out.println(sint);

        //Map with flatmap
        Map<String,Map<Integer,String>> pd = Map.of("First",Map.of(1,"Issac",2,"Noah"),"Second",Map.of(1,"mano",2,"pokesh"));
        Set<Map.Entry<String,Map<Integer,String>>> tw = pd.entrySet();
        List<String> vel = tw.stream().flatMap(e->e.getValue().entrySet().stream()).map(n->n.getValue()).toList();
        System.out.println(vel);

        System.out.println("********************distinct*************************");

        List<String> mm = List.of("Malabar","Kalyam","abc","abc","abc");
        List<String> nc =  mm.stream().distinct().collect(Collectors.toList());
        nc.add("prem kumar");
        System.out.println(nc);

        Map<Integer,String> kq = Map.of(1,"chandrasekar",2,"Rajasekar",3,"Balaji",4,"balaji");
        Collection cd = kq.values();
        List<String> pg = cd.stream().distinct().map(n->n+" Is a good boy").toList();
        System.out.println(pg);

        System.out.println("**************************************SORT***************************************");
        List<Integer> poj = List.of(23,1,4,0,99,35,63,5);
        List<Integer> vi = poj.stream().sorted().toList();
        System.out.println(vi);

        Student s1 = new Student("ITArun",10,"thirunveli","IT");
        Student s2 = new Student("DOCTORRamesh",100,"chennai","Doctor");
        Student s3 = new Student("PILOTSudharson",10,"tanjavur","Pilot");
        List<Student> lstud = new ArrayList<>(List.of(s1,s2,s3));

        List<Student>  red = lstud.stream().sorted(Comparator.comparing(Student::getName).reversed()).toList();
        System.out.println(red);

        System.out.println("************************peek ****************************************");
        Set<String> setste = new HashSet<>(Set.of("Varun","chak","saisudharson"));
        setste.stream().filter(n->n.equals("chak")).map(n->"The name is "+n+"ravarthy").peek(n->System.out.println(n)).forEach(n->System.out.println());

        System.out.println("************************ Limit  ****************************************");
        List<Integer> vl = new ArrayList<>();
        for(int i=0;i<200;i++)
        {
            vl.add(i);
        }
         vl.stream().limit(20).forEach(System.out::print);
        System.out.println();
        System.out.println("************************ Skip  ****************************************");
        vl.stream().skip(20).forEach(System.out::print);
        System.out.println();
        System.out.println("*********************************Terminator Operator************************");
        System.out.println("*********** Foreach**********");
        //ForEach
        List<String> of = List.of("alpha","Beta","Gamma");
        Stream<String> er = of.stream();
        er.forEach(n->System.out.println(n));
        //IllegalStateException occurs we cant use tthe stream once it is used by terminator operator
        //er.forEach(n->System.out.println(n));

        System.out.println("*********** toArray **********");
        //toArray
        List<String> off = List.of("MCU","LCU","DC");
        Object[] star = off.stream().toArray();
        System.out.println(Arrays.toString(star));

        System.out.println("*********** Findfirst  and Find Any**********");
        //findFirst
        List<Student> stud = new ArrayList<>(List.of(s1,s2,s3));
        String h = stud.stream().map(n->n.getName()).findFirst().get();
        System.out.println(h);
        //findAny
        String h1 = stud.parallelStream().map(n->"The Name Is "+n.getName()).findAny().get();
        System.out.println(h1);

        System.out.println("*******************AnyMatch ,AllMatch,NoneMAtch***************************");
        //AllMatch
        Student ss1 = new Student("ITapple",11,"Kashmir","IT");
        Student ss2 = new Student("DOCTORBall",11,"Lebanon","Doctor");
        Student ss3 = new Student("IASCat",22,"Egypt","IAS");
        Student ss4 = new Student("ITDog",22,"TamilNadu","IT");
        List<Student> io = new ArrayList<>(List.of(ss1,ss2,ss3,ss4));
        boolean allmat = io.stream().allMatch(n->n.getAge()>35);
        System.out.println(allmat);

        //Anymatch
        boolean anymat = io.stream().anyMatch(n->n.getAge()>25);
        System.out.println(anymat);

        //Nonematch
        boolean nonmat = io.stream().noneMatch(n->n.getAge()>100);
        System.out.println(nonmat);

        System.out.println("*******************Max min ***************************");
        Student stmax = io.stream().max(Comparator.comparing(Student::getAge)).get();
        System.out.println(stmax);
        Student stmin = io.stream().min(Comparator.comparing(Student::getAge)).get();
        System.out.println(stmin);

        //collect
        System.out.println("*****************************------->//ToList---->Toset--->ToMap*************************");
        List<String> devb = List.of("MCU","LCU","DC");
        List<String> clis= devb.stream().collect(Collectors.toList());
        System.out.println("List--->****"+clis);
        Set<String> xli =  devb.stream().collect(Collectors.toSet());
        System.out.println("Set--->****"+xli);
        Map<Integer,Student> comap =  Map.of(1,s1,2,s2,3,s3);
        Map<Integer,String> result = comap.entrySet().stream().collect(Collectors.toMap(n->n.getKey(),n->n.getValue().getName()));
        System.out.println("Map--->****"+xli);
        System.out.println(result);
        System.out.println("*************************************** GroupingBy ***********************************");
        List<Student> cgrp = new ArrayList<>(List.of(s1,s2,s3,ss1,ss2,ss3,ss4));
        Map<String,List<Student>> fs = cgrp.stream().collect(Collectors.groupingBy(Student::getJob));
        System.out.println(fs);
        System.out.println("*************************************** GroupingBy with mapping***********************************");
        Map<String,List<String>>opb = cgrp.stream().collect(Collectors.groupingBy(Student::getJob,Collectors.mapping(Student::getName,Collectors.toList())));
        System.out.println(opb);
        System.out.println("*************************************** GroupingBy with flatmapping ***********************************");

        //flatmapping is used in a case where the studen have any List of fields like List<Skills>
        // so after grouping we can flatten that in such cases we go for flatmapping other wise fapmat with mapping is enough

        List<List<Student>> lliststudent = List.of(List.of(s1,s2),List.of(s3,ss1),List.of(ss2,ss3,ss4));
        List<String> dn = lliststudent.stream().flatMap(List::stream).map(n->n.getJob()).distinct().toList();
        System.out.println(dn);


        Map<Integer,List<String>> rea = lliststudent.stream().flatMap(List::stream).collect(Collectors.groupingBy(Student::getAge,Collectors.flatMapping(n->Stream.of(n.getName()),Collectors.toList())));
        System.out.println(rea);


        System.out.println("*************************************** GroupingBy with filtering***********************************");
        // We can also filter before grouping, but the key difference is:
     // if we filter first, elements that don’t match are completely removed.// With filtering() inside grouping, we still keep all groups with Keys ,// but only the matching elements valued remain in each group.

        Map<String,List<Student>> kpo  = lliststudent.stream().flatMap(List::stream).collect(Collectors.groupingBy(Student::getName,Collectors.filtering(n->n.getAge()>20,Collectors.toList())));
        System.out.println(kpo);

        System.out.println("*******************  counting **********************************");
        //In this we use filter see the op it remove all other unmatched recor
       Map<String,Long> lio =  lliststudent.stream().flatMap(List::stream).filter(n->n.getAge()>20).collect(Collectors.groupingBy(Student::getName,Collectors.counting()));
       System.out.println(lio);

        System.out.println("*******************  Partitioning **********************************");
        Student se1 = new Student("seakr",25,"pochampalli","IT");
        Student se2 = new Student("Gokul",24,"Rameshwaram","IT");
        Student se3 = new Student("Vicky",26,"Kadallur","IT");
        Student se4 = new Student("Agnash",23,"Kanyakumari","Petrolem industry");
        Student se5 = new Student("Thiru",28,"Dubai","Business");
        Student se6 = new Student("Suriys",26,"Bangalaor","Business");
        List<Student> gig = List.of(se1,se2,se3,se4,se5,se6);
        System.out.println(gig);
        Map<String,Long> gigres=  gig.stream().collect(Collectors.groupingBy(Student::getJob,Collectors.counting()));
        System.out.println(gigres);
        System.out.println();
        Map<Boolean ,List<Student>> colpat = gig.stream().collect(Collectors.partitioningBy(s->s.getAge()>25));
        colpat.forEach((key,value)-> {System.out.println(key+" ->"+value);});

        System.out.println("*******************  Joining **********************************");

       Map<String, List<String>> kdj =  gig.stream().collect(Collectors.groupingBy(Student::getJob,Collectors.mapping(Student::getName,Collectors.toList())));
        System.out.println(kdj);

        Map<String, String> kdj1 = gig.stream().collect(Collectors.groupingBy(Student::getJob,Collectors.mapping(Student::getName,Collectors.joining(" ,"))));
        System.out.println(kdj1);

        System.out.println("*****************************Stream To Parallel Stream ************************************************");
        //Straight Stream creation
       Set<String> setstrings = new HashSet<>(Set.of("Johncena","Mark hendry","TripleH"));
        Stream<String> lsf = setstrings.stream();
        lsf.forEach(n-> System.out.println(n));

        //Straight ParallelStream creation
        Stream<String> setpstrings = setstrings.parallelStream();
        setpstrings.forEach(n-> System.out.println(n));

        //parallelstream from stream
        setstrings.stream().parallel().forEach(n-> System.out.println(n));

        //stream from Parallestream
        setstrings.parallelStream().sequential().forEach(n-> System.out.println(n));

        /// sample
        List<List<String>> sam = List.of(List.of("Chandra","Sekar","balaji"),List.of("Vinoth","Kumar","balaji"));
        sam.stream().map(n->n.stream().map(n1->n1).toList()).peek(n2-> n2.stream().forEach(n-> System.out.println(n))).forEach(t-> System.out.print(""));

        List<String> sam1  = List.of("xxx","yyy","ZZZ");
        sam1.stream().map(n->n+" name da").forEach(n-> System.out.println(n));

        //Explaining how flat map works to flaten the list of elements
        /*
FlatMap Cheat Sheet — Example

Input (List of Lists)
---------------------
[
  ["Chandra", "Sekar", "balaji"],   // inner list 1
  ["Vinoth", "Kumar", "balaji"]     // inner list 2
]
Type: List<List<String>>

Step 1: llstr.stream()
----------------------
Stream<List<String>>:
  Element 1 -> ["Chandra", "Sekar", "balaji"]
  Element 2 -> ["Vinoth", "Kumar", "balaji"]

Step 2: flatMap(List::stream)
-----------------------------
For element 1 -> Stream("Chandra", "Sekar", "balaji")
For element 2 -> Stream("Vinoth", "Kumar", "balaji")

flatMap merges these into:
Stream<String>:
  "Chandra"
  "Sekar"
  "balaji"
  "Vinoth"
  "Kumar"
  "balaji"

Step 3: .map(n -> n + " is my name")
------------------------------------
Stream<String>:
  "Chandra is my name"
  "Sekar is my name"
  "balaji is my name"
  "Vinoth is my name"
  "Kumar is my name"
  "balaji is my name"

Step 4: collect(Collectors.toList())
------------------------------------
List<String>:
[
  "Chandra is my name",
  "Sekar is my name",
  "balaji is my name",
  "Vinoth is my name",
  "Kumar is my name",
  "balaji is my name"
]
*/



    }
}
