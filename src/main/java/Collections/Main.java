package main.java.Collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Person> pList= new ArrayList<>();
        Person p1= new Person("Shiwang",'M');
        pList.add(p1);
        Person p2= new Person("latika",'F');
        pList.add(p2);
        Person p3= new Person("Anil",'F');
        pList.add(p3);
        Person p4= new Person("Khanna",'M');
        pList.add(p4);
        Person p5= new Person("Loop",'M');
        pList.add(p5);
        Person p6= new Person("ayesha",'F');
        pList.add(p6);

        pList.forEach(Person -> System.out.println(Person.getName()+" "+Person.getGender()));


    }
}
