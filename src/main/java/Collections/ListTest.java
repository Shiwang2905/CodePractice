package main.java.Collections;
import java.util.*;
public class ListTest {
    public static void main(String[] args) {

        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(2);
        primes.add(7);

        Set<Integer> WithoutDupPrimes= new LinkedHashSet<>(primes);

        primes.clear();
        primes.addAll(WithoutDupPrimes);

        for(Integer i: primes){
            System.out.println(i);
        }
    }
}
