package main.java.Collections;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String name;
    private final char Gender;
    List<Person> personList= new ArrayList<>();

    public Person(String name, char gender){
        this.name=name;
        this.Gender=gender;
    }
    public void addPlayer(){
        personList.add(new Person(this.name,this.Gender));
    }
    public String getName() {
        return name;
    }

    public char getGender() {
        return Gender;
    }


}
