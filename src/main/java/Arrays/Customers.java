package main.java.Arrays;

import java.util.ArrayList;

public class Customers {

    private String name;
    private ArrayList<Double> transaction;
    public Customers(String name, double intialamount){
        this.name=name;
        this.transaction= new ArrayList<Double>();
        addTransaction(intialamount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }
     public void addTransaction(double amount){
        transaction.add(amount);
     }

}
