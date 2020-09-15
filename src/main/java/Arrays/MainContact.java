package main.java.Arrays;

import java.util.Scanner;

public class MainContact {
    static Scanner input= new Scanner(System.in);
    static MobilePhone nokia = new MobilePhone();
    public static void main(String[] args) {

        ContactMethod();
        boolean Loop= true;

        while(Loop){
            System.out.print("Enter your choice : ");
            boolean isInt= input.hasNextInt();
            if(isInt) {
                int num = input.nextInt();

                switch (num) {
                    case 0:
                        ContactMethod();
                        break;
                    case 1:
                        printContactlist();
                        break;
                    case 2:
                        CreatContact();
                        break;
                    case 3:
                        ModifyContact();
                        break;
                    case 4:
                        removeContact();
                        break;
                    case 5:
                        findContact();
                        break;
                    case 6:
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

    public static void ContactMethod(){
        System.out.println("0- To enter choice");
        System.out.println("1- To print contacts");
        System.out.println("2- To create contact");
        System.out.println("3- To modify contact ");
        System.out.println("4- To remove contact");
        System.out.println("5- To find contact");
        System.out.println("6- To Exit");

    }
    public static void printContactlist(){
        nokia.printcontact();
    }

    public static void CreatContact(){
        System.out.print("Enter the person name : ");
        String name=input.next();
        System.out.print("Enter the mobile number : ");
        String number=input.next();
        nokia.createContact(name,number);
    }
    public static void ModifyContact(){
        System.out.print("Enter the contact name which you want to edit : ");
            String Cname= input.next();
            boolean check=nokia.findContact(Cname);
            int number=nokia.findposition(Cname);
            if(check){
                System.out.print("Found : "+nokia.getContactName(number)+"\n");
                System.out.print("Enter the name you want to replace : ");
                String newName=input.next();
                nokia.setContactName(number,newName);
                System.out.println("Successfully replaced "+Cname+" by "+newName);
                System.out.print("Do you want to edit number as well ? \n");
                System.out.println("Enter 1 for YES");
                System.out.println("Enter 0 for NO");
                int n=input.nextInt();
                switch (n){
                    case 0:
                        System.out.println("Okh ! No changes for Mobile number");
                        break;
                    case 1:
                        System.out.print("Enter the number : ");
                        String number2=input.next();
                        nokia.setContactNumber(number,number2);
                        System.out.println("Done !");
                        break;
                }

            }
            else{
                System.out.println("Not in the contact");
            }

    }
    public static void findContact(){
        System.out.print("Enter the contact name that you want to search : ");
        String name= input.next();
        boolean Present=nokia.findContact(name);
        int position= nokia.findposition(name);
        if(Present) {
            System.out.println("Contact found :");
            System.out.println("\tName : " + nokia.getContactName(position));
            System.out.println("\t Mob Number : " + nokia.getContactNumber(position));
        }else {
            System.out.println("This is not in the contact list");
        }

    }

    public static void removeContact(){
        System.out.println("Enter name of contact you want to remove : ");
        String nam=input.next();
        boolean isContact= nokia.findContact(nam);
        int index= nokia.findposition(nam);
        if(isContact){
            nokia.removeContact(index);
        }else{
            System.out.println("Not found !!");
        }

    }
    public static void replaceMNum(){

    }

}
