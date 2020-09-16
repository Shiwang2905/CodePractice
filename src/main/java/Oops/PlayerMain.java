package main.java.Oops;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerMain {
    public static void main(String[] args) {

        Player Charlie= new Player("Charlie",100, 49);
        System.out.println(Charlie.toString());
        Charlie.setHitpoints(80);
        Charlie.setWeapon("Assault Rifle");
        saveValue(Charlie);
        LoadObject(Charlie);
        System.out.println(Charlie.toString());

        Isaveable m= new Monster("Zombies",500, 100);
        System.out.println(m.toString());
        ((Monster)m).setHitpoints(600);
        ((Monster)m).setDamage(130);
        saveValue(m);
        LoadObject(m);
        System.out.println(m.toString());
    }

    public static ArrayList<String> readValues(){
        ArrayList<String> Ivalues= new ArrayList<>();
        Scanner input= new Scanner(System.in);
        boolean quit= true;
        int i=0;
        System.out.println("Enter \n" +
                "1 to put value \n" +
                "0 to exit !");
        while(quit){
            System.out.print("Choose : ");
            int c=input.nextInt();
            input.nextLine();
            switch (c){
                case 0:
                    System.out.println(" Saved ");
                    quit=false;
                    break;
                case 1:
                    System.out.print("Enter the string : ");
                    String s=input.nextLine();
                    Ivalues.add(i,s);
                    i++;
                    break;
            }
        }
        return Ivalues;
    }

    public static void saveValue(Isaveable saveObject){
        for(int i=0; i<saveObject.write().size(); i++){
            System.out.println("saving " +saveObject.write().get(i)+" to storage");
        }
    }

    public static void LoadObject(Isaveable SavedObject){
        ArrayList<String> ValueS= readValues();
        SavedObject.read(ValueS);
    }

}
