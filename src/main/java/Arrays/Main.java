package main.java.Arrays;

import java.util.Scanner;

public class Main {
    static Scanner input= new Scanner(System.in);
     static Arraylist1 grocery= new Arraylist1();

    public static void main(String[] args) {
        Enterchoice();
        boolean Loop= true;
        while(Loop){
            System.out.print("Enter your choice : ");
            boolean isInt= input.hasNextInt();
            if(isInt) {
                int num = input.nextInt();

                switch (num) {
                    case 0:
                        Enterchoice();
                        break;
                    case 1:
                        printgrocery();
                        break;
                    case 2:
                        addItem();
                        break;
                    case 3:
                        modifyItem();
                        break;
                    case 4:
                        removeItem();
                        break;
                    case 5:
                        Loop = false;
                        break;
                }
            }
            else{
                System.out.println("Invalid choice !! enter number");
                input.nextLine();
            }
        }
    }

    public static void Enterchoice(){
        System.out.println("0- To enter choice");
        System.out.println("1- To print grocery list");
        System.out.println("2- To add item ");
        System.out.println("3- To modify item");
        System.out.println("4- To remove item");

    }

    public static void printgrocery(){
            grocery.printGrocerylist();
    }

    public static void addItem(){
        System.out.print("enter item : ");
        String item=input.next();
        grocery.addGrocery(item);
    }

    public static void modifyItem(){
        System.out.print("Enter the position where you want to modify item : ");
        int index=input.nextInt();
        System.out.print("Enter the item that you want to replace : ");
        String newItem=input.next();
        grocery.ModifyGroceryItem(index,newItem);
    }

    public static void removeItem(){
        System.out.print("Enter the item that you want to remove : ");
        String NewItem=input.next();
        grocery.removeGroceryItem(NewItem);
    }

}
