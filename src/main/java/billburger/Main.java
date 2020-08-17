package main.java.billburger;

import main.java.BillBurger.DeluxeBurger;

public class Main {
    public static void main(String[] args) {

        DeluxeBurger d1= new DeluxeBurger();

        System.out.println("Total price of burger = "+ d1.CalculatePrice());
    }
}
