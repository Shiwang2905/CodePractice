package main.java.SmallCodes;

import java.util.Scanner;

public class rev {
    public static void main(String [] args ){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter your String to check if it is a plaindrome or not: ");
        String org,rev="";
        org=obj.nextLine();
        int l=org.length();

        for(int i=l-1;i>=0;i--){
            rev=rev+org.charAt(i);
            System.out.print(rev);
        }

    }
}
