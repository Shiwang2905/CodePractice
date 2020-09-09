package main.java.Arrays;

import java.util.ArrayList;

public class Bank {
    private String bankname;
    public ArrayList<Branches> branch;
    public Bank(String bankname) {
        this.bankname = bankname;
        this.branch= new ArrayList<Branches>();
    }

    public String getBankname() {
        return bankname;
    }

    public ArrayList<Branches> getBranch() {
        return branch;
    }

    public boolean addBranch(String branchname){
        Branches branch1= findBranch(branchname);
        if(branch1==null){
            this.branch.add(new Branches(branchname));
            return true;
        }
        return false;
    }

    public Branches findBranch(String branchname){
        for(int i=0; i<branch.size(); i++){
            if(branch.get(i).getBranchName().equals(branchname)){
                return branch.get(i);
            }
        }
        return null;
    }

    public void printList(String branchName,boolean TransList){
        Branches b1= findBranch(branchName);
        if(b1!=null) {

            System.out.println("Branches : \n"+ b1.getBranchName());
            ArrayList<Customers> c1= b1.getCustomer();
            for(int i=0; i<c1.size(); i++) {
                Customers checked = c1.get(i);
                    System.out.println("Transaction" + " [i] : " + checked.getName());
            }

            }
        }

    }

