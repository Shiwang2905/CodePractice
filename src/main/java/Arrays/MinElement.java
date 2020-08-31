package main.java.Arrays;

import java.util.Scanner;

public class MinElement {
    static Scanner sc= new Scanner(System.in);

    public static int[] readIntegers(int count){
        int[] input= new int[count];
        int j=1;
        while(j<=count) {

                System.out.print("Enter the number : "+j +"\n");

                boolean checkInt = sc.hasNextInt();
                if (checkInt) {

                    input[j-1] = sc.nextInt();
                    j++;
                } else {
                    System.out.println("invalid !");
                    sc.nextLine();
                }
            sc.close();
        }
        return input;

    }

    public static int findMin(int[] array){
        int minimum= array[0];
        for(int i=1; i< array.length; i++){
            if(array[i]<minimum){
                minimum=array[i];
            }
        }
        return minimum;
    }

}
