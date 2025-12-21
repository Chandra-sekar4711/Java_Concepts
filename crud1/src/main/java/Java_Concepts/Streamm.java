package Java_Concepts;

import com.crud1.Sample.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamm {

    public static void main(String[] args) {

        //Stream creation from Array
        int[] a = {1,2,3,4,5};
        IntStream as = Arrays.stream(a);
        as.forEach(System.out::print);
        System.out.println();

        int[] aa = {100,200};
        List ssr = Arrays.stream(aa).boxed().collect(Collectors.toList());
        System.out.println(ssr);

        //Stream Creation from Stream
        Stream<Integer> si = Stream.of(11,22,33);
        si.map(n->n*2).forEach(n-> System.out.println(n));

        List<String> ls = List.of("chandrasekar","Rajasekar","Balaji");
        Set<String> sstr = ls.stream().collect(Collectors.toSet());
        System.out.println(sstr);

        //Stream Create from Collection
        //From List

        List<Object> lli =  new ArrayList<>();
        lli.add("apple");
        lli.add(22);
        List<Object>  oobj = lli.stream().collect(Collectors.toList());
        System.out.println(oobj);

        //from Set
        Set<String> sestr = Set.of("Boy","Girl","Cat");
        Stream<String> sestr1= sestr.stream();
        Set<String> sdres = sestr1.collect(Collectors.toSet());
        System.out.println(sdres);

        //Straem from map
        Map<Integer,String> hss = new HashMap<>();
        hss.put(1,"Apple");
        hss.put(2,"Ball");
        hss.put(3,"cat");
        Set<Map.Entry<Integer,String>> hssres = hss.entrySet();
//        List<Map.Entry<Integer,String>> jh = hssres.stream().collect(Collectors.toList());
//        System.out.println(jh.get(0));
        Map<Integer,String> resss= hssres.stream().collect(Collectors.toMap(n->n.getKey(),n->n.getValue()));
        System.out.println(resss);

        System.out.println("****************************************Intermediate operator*********************************");
        //Map,filter,flatmap,Distinct,sorted,peek,limit,skip
        System.out.println("******************************** Map ***********************");
        List<String> lm = List.of("Issac","Noah");
        Stream<String> lms= lm.stream();        System.out.println(lms);
        lms.map(n->"My name is --> "+n).forEach(System.out::print);

        //Set with map
        Set<Integer> sii = Set.of(21,22,23,24,25);
        Stream<Integer> sint =  sii.stream();
        List<Integer> lo = sint.map(n->n+100).collect(Collectors.toList());
        System.out.println(lo);

        //Map with map
        Map<Integer,String> mwm = Map.of(1,"chandrasekar",2,"Rajasekar",3,"Balaji");
        Set<Map.Entry<Integer,String>> jo = mwm.entrySet();
        Stream<Map.Entry<Integer,String>> mstri = jo.stream().map(n->Map.entry(n.getKey(),n.getValue()+" Periyasami"));
        Map<Integer,String> pi = mstri.collect(Collectors.toMap(n->n.getKey(),n->n.getValue()));
        System.out.println(pi);

        Set<Integer> jo1 = mwm.keySet();
        Set<Integer> jo1res = jo1.stream().map(n->n*10).collect(Collectors.toSet());
        System.out.println(jo1res);

        Collection<String> ci = mwm.values();
        List<String> opj = ci.stream().map(n->n.toString().toUpperCase()).collect(Collectors.toList());
        System.out.println(opj);

        System.out.println("************************************************FIlter**********************************");
        //List with filter
        List<Integer> ci1 = List.of(1,2,3,4,5);
        Stream<Integer> ci1res = ci1.stream().map(n->n*10);
        List<Integer> nb = ci1res.filter(n->n>30).collect(Collectors.toList());
        System.out.println(nb);

        //Set with Filter
        Set<Integer> ci2 = Set.of(100,200);
        List<String> ci2res = ci2.stream().map(n->String.valueOf(n)+"1").filter(n->n.equals("2003")).collect(Collectors.toList());
        System.out.println(ci2res);

        //Map with filter
        Map<String,String> hmn = new HashMap<>();
        hmn.put("name","chandrasekar");
        hmn.put("age","26");
        hmn.put("job","Java developer");
        List<String> hm1res  =hmn.keySet().stream().filter(n->n.equals("age")).map(n->n+"aaitu").collect(Collectors.toList());
        System.out.println(hm1res);

        System.out.println("********************************flatmap***********************");

        //List with flatmap
        List<List<String>> llos = List.of(List.of("ramesh","sudharson","arun"),List.of("Kaali","Rajesh","Anu"),List.of("Selva","Mohan","Srikanth"));
        List<String> ks  = llos.stream().flatMap(n->n.stream()).map(n->n.toUpperCase() + " in IGO").collect(Collectors.toList());
        System.out.println(ks);

        //Palindrome
        List<String> pallist = new ArrayList();
        pallist.add("mom");
        List pallistres = pallist.stream().filter(n->n.equals(new StringBuilder(n).reverse().toString())).collect(Collectors.toList());
        System.out.println(pallistres);

        //Set with Flatmap
        Set<Set<String>> smpa = Set.of(Set.of("ramesh","sudharson","arun"),Set.of("arun","Rajesh","Anu"),Set.of("Selva","Mohan","Srikanth"));
        Set<String> sstr1 = smpa.stream().flatMap(n->n.stream()).map(n->n.toUpperCase()).collect(Collectors.toSet());
        System.out.println(sstr1);

        //Map with flatmap
        Map<String,Map<Integer,String>> pd = Map.of("First",Map.of(1,"Issac",2,"Noah"),"Second",Map.of(3,"mano",4,"pokesh"));
        Set<Map.Entry<String, Map<Integer, String>>> dhu = pd.entrySet();
        dhu.stream().flatMap(n->n.getValue().entrySet().stream()).collect(Collectors.toMap(n->n.getKey(),n->n.getValue()+" ------> Names"));

        System.out.println("********************distinct*************************");
        List<String> mm = List.of("Malabar","Kalyam","abc","abc","abc");
        List<String> ha = mm.stream().distinct().collect(Collectors.toList());
        System.out.println(ha);

        Map<Integer, String> kq = Map.of(1, "chandrasekar", 2, "Rajasekar", 3, "Balaji", 4, "balaji");
        Collection<String> kqc = kq.values();
        String vj =  kqc.stream().distinct().max(Comparator.naturalOrder()).get();
        System.out.println(vj);

        System.out.println("**************************************SORT***************************************");

        List<Integer> poj = List.of(23,1,4,0,99,35,63,5);
        List<Integer> poj1 = poj.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toUnmodifiableList());
        System.out.println(poj1);

        List<Integer> poj2 = poj.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(poj2);

        Integer ip = poj.stream().max(Comparator.naturalOrder()).get();
        System.out.println(ip);

        Integer ipp = poj.stream().min(Comparator.reverseOrder()).get();
        System.out.println(ipp);

        System.out.println("************************peek ****************************************");
        Set<String> setste = new HashSet<>(Set.of("Varun","chak","saisudharson"));
        setste.stream().map(n->n.charAt(0)).peek(n->System.out.println("Peek--->"+n)).forEach(System.out::println);


        System.out.println("************************limit ****************************************");
        List<Integer> vl = new ArrayList<>();
        for(int i=0;i<=100;i++)
        {
            vl.add(i);
        }
        vl.stream().limit(81).forEach(System.out::print);

        System.out.println("************************ Skip  ****************************************");
        vl.stream().skip(81).forEach(System.out::print);


        System.out.println("*********************************Terminator Operator************************");
        //foreach,collect,toArray,allmatch,anymatch,nonematch,findfirst,findany,max,min
        //Collectors.toList(),Collectors.toSet(),Collectosrs.toMap()
        System.out.println("*********** Foreach**********");
        //ForEach
        List<String> of = List.of("alpha","Beta","Gamma");
        of.stream().map(n->n+"Created").forEach(n->System.out.println(n));

        //toArray
        List<String> los = new ArrayList();
        los.add("Kiran");
        los.add("Aryan");
        Object[] oa= los.stream().map(n->n+"added").toArray();
        System.out.println(Arrays.toString(oa));

        //AllMatch,Any Match
        System.out.println("*********** Findfirst and FindAny**********");
        //findFirst
        Student s1 = new Student("ITArun",10,"thirunveli","IT");
        Student s2 = new Student("DOCTORRamesh",100,"chennai","Doctor");
        Student s3 = new Student("PILOTSudharson",10,"tanjavur","Pilot");

        List<Student> lstud = List.of(s1,s2,s3);
        Student kv =lstud.stream().findFirst().get();
        System.out.println(kv);

        Student kv1 =lstud.stream().findAny().get();
        System.out.println(kv1);

        System.out.println("*******************AnyMatch ,AllMatch,NoneMAtch***************************");
        //AllMatch
        Student ss1 = new Student("ITapple",25,"Kashmir","IT");
        Student ss2 = new Student("DOCTORBall",12,"TamilNadu","Doctor");
        Student ss3 = new Student("IASCat",22,"Egypt","IAS");
        Student ss4 = new Student("ITDog",23,"TamilNadu","IT");
        List<Student> io = new ArrayList<>(List.of(ss1,ss2,ss3,ss4));

        boolean b= io.stream().allMatch(n->n.getAge()>25);
        System.out.println(b);

        boolean b1 = io.stream().anyMatch(n->n.getAddress().equals("TamilNadu"));
        System.out.println(b1);

        boolean b3 = io.stream().noneMatch(n->n.getAge()>5);
        System.out.println(b3);

        System.out.println("*******************Max min ***************************");

        Student max_age = io.stream().max(Comparator.comparing(Student::getAge)).get();
        System.out.println(max_age);

        Student min_age = io.stream().min(Comparator.comparing(Student::getAge)).get();
        System.out.println(min_age);

        Object[] sort1 = io.stream().sorted(Comparator.comparing(Student::getAge)).toArray();
        System.out.println(Arrays.toString(sort1));

        System.out.println("******************* toList // toset // toMap ***************************");

         List<Student> bgf = io.stream().collect(Collectors.toUnmodifiableList());
        System.out.println(bgf);

        Set<Student> bgf1 = io.stream().collect(Collectors.toUnmodifiableSet());
        System.out.println(bgf1);

        Map<Integer,String> ll = io.stream().collect(Collectors.toMap(n->n.getAge(),n->n.getAddress()));
        System.out.println(ll);

        System.out.println("***************************************** GroupingBy ***********************************");
          //GroupingBy---->mapping,faltmapping,filtering,counting,maxby,minby, Collectors.collectingAndThen,Collectors.averagingDouble
        List<Student> cgrp = new ArrayList<>(List.of(ss1, ss2, ss3, ss4));
        Map<String,List<Student>> cres1 = cgrp.stream().collect(Collectors.groupingBy(Student::getJob));
        System.out.println(cres1);

        System.out.println("***************************************Groupby with mapping********************************");
        List<Student> cgrpm = new ArrayList<>(List.of(ss1, ss2, ss3, ss4));
        Map<String,List<String>> ke = cgrpm.stream().collect(Collectors.groupingBy(Student::getJob,Collectors.mapping(Student::getName,Collectors.toList())));
        System.out.println(ke);

        System.out.println("*************************************** GroupingBy with filtering***********************************");
        // We can also filter before grouping, but the key difference is:
        // if we filter first, elements that don’t match are completely removed.// With filtering() inside grouping, we still keep all groups with Keys ,// but only the matching elements valued remain in each group.
        List<List<Student>> lliststudent = List.of(List.of(ss1,ss2),List.of(ss3,ss4));
        List<Student> nn = lliststudent.stream().flatMap(n->n.stream()).filter(n->n.getJob().equals("IT")).collect(Collectors.toList());
        System.out.println(nn);

        System.out.println("*********************************");
        Map<String,List<Student>> lpo = lliststudent.stream().flatMap(n->n.stream()).collect(Collectors.groupingBy(Student::getJob,Collectors.filtering(n->n.getJob().equals("IT") && n.getName().equals("ITDog"),Collectors.toList())));
        System.out.println(lpo);

        System.out.println("*************************************** GroupingBy with Counting ***********************************");
        Map<String,Long> lu = lliststudent.stream().flatMap(List::stream).collect(Collectors.groupingBy(Student::getJob,Collectors.counting()));
        System.out.println(lu);

        System.out.println("*******************  Partitioning **********************************");
        Student se1 = new Student("seakr",25,"pochampalli","IT");
        Student se2 = new Student("Gokul",24,"Rameshwaram","IT");
        Student se3 = new Student("Vicky",26,"Kadallur","IT");
        Student se4 = new Student("Agnash",23,"Kanyakumari","Petrolem industry");
        Student se5 = new Student("Thiru",28,"Dubai","Business");
        Student se6 = new Student("Suriys",26,"Bangalaor","Business");

          List<Student> kf = List.of(se1,se2,se3,se4,se5,se6);
          Map<Boolean,List<Student>> ud =  kf.stream().collect(Collectors.partitioningBy(n->n.getAge()>15));
          System.out.println(ud);

        System.out.println("*******************  Joining  **********************************");
        List<String> sr= List.of("chandrasekar","John","kimi");
        String h = sr.stream().collect(Collectors.joining(","));
        System.out.println(h.length());

       String[] saa =  h.split(",");
        System.out.println(saa[0]);


        System.out.println("*****************************Stream To Parallel Stream ************************************************");

        List<String> mano = List.of("Apple","Ball","carrot");
        Stream<String> stresd = mano.stream();
        stresd.forEach(n-> System.out.println(n));

        Stream<String> kr  = mano.parallelStream();
        kr.forEach(System.out::print);

        //----Stream to parallel stream
        mano.stream().parallel().peek(n-> System.out.print(n)).forEach(n-> System.out.println());

        //Parallel Stream to Stream
        mano.parallelStream().sequential().forEach(System.out::println);


        @Data
        @NoArgsConstructor
        @AllArgsConstructor

        class Employee{
            private int id;
            private String name;
            private String department;
            private double salary;
            private String location;
        }

        Employee er1 = new Employee(1,"chandrasekar","Java",2000,"Chennai");
        Employee er2 = new Employee(2,"Rajasekar","Physics",1000,"Dharmapuri");
        Employee er3 = new Employee(3,"balaji","Java",200,"Bangalore");
        Employee er4 = new Employee(4,"Karthik","Physics",100,"Dharmapuri");


        List<Employee> vu = List.of(er1,er2,er3,er4);

        System.out.println("*********************  Practise ***************************");

         //Q1
        Employee emp = vu.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("Employee getting max salary==>"+emp.getSalary());

        //q2
        Map<String,Optional<Employee>> q2 = vu.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(q2);

        Map<String, Double> q21 =
                vu.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                                        opt -> opt.map(Employee::getSalary).orElse(0.0)
                                )
                        ));
        System.out.println(q21);

        //q3

       Map<String,List<Employee>> q3 = vu.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(q3);

        //q4
        Map<String,List<String>> q4 = vu.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.toList())));
        System.out.println(q4);

        //q5
        String q5 = vu.stream().map(n->n.getName()).collect(Collectors.joining(","));
        System.out.println(q5);

        //q6
        Map<Integer,String> q6 = vu.stream().distinct().collect(Collectors.toMap(Employee::getId, Employee::getName));
        System.out.println(q6);

        //q7
        Map<String,Double> q7 = vu.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(q7);
        //q8

        Double avg = vu.stream().mapToDouble(Employee::getSalary).average().orElse(0);
        Map<String,List<Employee>>  q8 = vu.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.filtering(n->n.getSalary()>avg,Collectors.toList())));
        System.out.println("Q8-------->>>>>"+q8);

        //q9
       Map<String,Long> q9 =  vu.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(q9);

        //q10
        Map<String,String> q10 = vu.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.joining(","))));
        System.out.println("q10-->"+q10);

        //q10
        DoubleSummaryStatistics total_salary = vu.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(total_salary.getSum());

        System.out.println("==================================== practise 2 ======================================================");
        //q1

        Optional<Employee> res1 =  vu.stream().max(Comparator.comparing(Employee::getSalary));
        Employee res11 = res1.orElseThrow(null);
        System.out.println(res11);

       //q2
       Map<String,Optional<Employee>>  rw = vu.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
       Map<String,Employee> ewres = rw.entrySet().stream().filter(n->n.getValue().isPresent()).collect(Collectors.toMap(n->n.getKey(),n1->n1.getValue().get()));
       System.out.println(ewres);

       Map<String,String> tres =  vu.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)),n->n.map(Employee::getName).orElse("0"))));
       System.out.println(tres);

       //q3

        Map<String,List<Employee>> q33 = vu.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(q33);

        //q4
        Map<String,List<String>> nh = vu.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.toList())));
        System.out.println(nh);

        //q5
        List<String> lll = List.of("Sekar","chandra","Rajasekar");
        String dk1 = lll.stream().collect(Collectors.joining(","));
        System.out.println(dk1);

        //q6
        Map<Integer,String> nhk = vu.stream().distinct().collect(Collectors.toMap(n->n.getId(),n->n.getName()));
        System.out.println(nhk);

        //q7
        Map<String,Double> ddd = vu.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(ddd);

        //q8
        Double fe =vu.stream().mapToDouble(Employee::getSalary).average().orElse(0);
        Map<String,List<Employee>> kp = vu.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.filtering(n->n.getSalary()>fe,Collectors.toList())));
        System.out.println(kp);

        //q9
        Map<String,Long>  lon = vu.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(lon);

        //q10
        DoubleSummaryStatistics total_salaryq = vu.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(total_salaryq.getSum());

    }
}
