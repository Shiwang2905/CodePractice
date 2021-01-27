package main.java.Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetsPractice {
    public static void main(String[] args) {

        Set<Integer> squares= new HashSet<>();
        Set<Integer> cubes= new HashSet<>();
        for(int i=1; i<=100; i++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }
        System.out.println(squares.size() +" squares and "+ cubes.size()+" cubes");

        Set<Integer> squaresAndCubes= new HashSet<>(squares);
        squaresAndCubes.addAll(cubes);
        System.out.println(squaresAndCubes.size()+" numbers");

        Set<Integer> intersection= new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println(intersection.size()+" numbers");
        for(int i: intersection){
            System.out.println(i+" is square root of"+Math.sqrt(i)+" cube root of "+Math.cbrt(i));
        }

        Set<String> words= new HashSet<>();
        String word=" here is my new code with collections";
        String[] arrayword=word.split(" ");
        words.addAll(Arrays.asList(arrayword));
        for(String s: words){
            System.out.println(s);
        }

        Set<String> nature= new HashSet<>();
        String[] natureWords= {"hello", "Hi","Bye","Go", "and","run"};
        nature.addAll(Arrays.asList(natureWords));

        Set<String> divine= new HashSet<>();
        String[] divineWords= {"Get", "Set","Jet","Go", "and","Me"};
        divine.addAll(Arrays.asList(divineWords));

        Set<String> differentWords= new HashSet<>(nature);
        differentWords.addAll(divine);
        printSet(differentWords);

        Set<String> commonWords= new HashSet<>(divine);
        commonWords.retainAll(nature);
        printSet(commonWords);

        Set<String> distinct= new HashSet<>(differentWords);
        distinct.removeAll(commonWords);
        printSet(distinct);
    }

    private static void printSet(Set<String> set){
        for(String s: set){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
