package main.java.Arrays;

import java.util.ArrayList;

public class Branches {
    private String branchName;
    public ArrayList<Customers> customer;

    public Branches(String branchName){
        this.branchName=branchName;
        this.customer= new ArrayList<Customers>();

    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customers> getCustomer() {
        return customer;
    }
        public boolean addCustomer(String name, double IntialAmount){
        if(findCustomer(name)==null){
            this.customer.add(new Customers(name, IntialAmount));
            return true;
        }
        return false;
        }

        public boolean addTransaction(String customerName, double amount){
        Customers cust= findCustomer(customerName);
        if(cust!=null){
            cust.addTransaction(amount);
        return true;
        }
        return false;
        }

        public Customers findCustomer(String customerName){
        for(int i=0; i<customer.size(); i++){
            if(customer.get(i).getName().equals(customerName)){
                return customer.get(i);
            }
        }
        return null;
        }



}
