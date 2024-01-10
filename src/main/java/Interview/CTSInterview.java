package Interview;

import java.util.*;
import java.util.stream.Collectors;
/*
IOC and DI

.Giving controller to the container to get instance of object is called IOC.
.IOC is a principle which is used to manage and collaborate dependencies using the objects in the application.
.IOC Container is away acheieve loose cuoling between object dependencies.
.IOC will use dependency injection to manage the objects.
DI
.the process of injection one class object into another class is called as DI
.DI is a design pattern in order to remove dependency from the programming code



 */
public class CTSInterview {
    public static void Doprint(BaseA o){
        o.print();

    }


    public static void main(String[] args) {

        // find out f and m employees in company
        ArrayList<Employee> empList= new ArrayList<>();

        empList.add( new Employee(1,"Abc","F",60,5000));
        empList.add( new Employee(2,"GHT","M",40,1000));
        empList.add( new Employee(3,"Abc1","F",30,5000));
        empList.add( new Employee(4,"GHT2","M",80,1000));
// print the gender counting
        Map<String,Long> GenderList= empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(GenderList);

        // based on gender display the saraly avarge
        Map<String,Double> AvgList= empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(AvgList);
        // based on age sort the lsit
        List<Employee> ageList= empList.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());

        ageList.forEach(x->System.out.println("ID:" + x.getId()+"name:"+x.getName()));


        BaseA A= new BaseA();
        DerivedD D= new DerivedD();
        BaseA C= new DerivedD();
        Doprint(A);//Base

        Doprint(D);//Derived
        Doprint(C);//Derrived
        // Qusetion dispaly the largest number

        int[] list= {1,5,89,45};
        Integer lagest= Arrays.stream(list).boxed()
                .sorted(Comparator.reverseOrder())
                .findFirst().get();
        System.out.println(lagest);
// using stream
        String numbersString = "3,30,34,5,9";

        // Step 1: Split the string into an array of strings
        String[] numbersArray = numbersString.split(",");

        int largestNumber = Arrays.stream(numbersArray)
                .map(Integer::parseInt)
                .max(Comparator.naturalOrder())
                .orElse(Integer.MIN_VALUE);

        System.out.println(largestNumber);
        //Questing in string of lagrest nubmber
       String str[]={"3","30","34","5","9"};
        System.out.println(lagestNumber(str));


    }
    public static String lagestNumber(String arg[]){
        Arrays.sort(arg,(n1,n2)->(n2+n1).compareTo(n1+n2));
        String sth="";
        for(String s:arg)
        {
            sth=sth+s;
        }
        return sth;
    }
    }

