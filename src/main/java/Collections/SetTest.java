package main.java.Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> words= new LinkedHashSet<>();
        for(String s: args){
            words.add(s);
        }
        System.out.println(words.size()+ " words : "+words);
    }
}
