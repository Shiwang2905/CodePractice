package main.java.Arrays;

import java.util.Scanner;

public class Array {
    static Scanner scanner= new Scanner(System.in);

    public static void putInput(){
        boolean flag=true;
        while(flag) {
            System.out.printf("How many numbers you want to sort : ");
            boolean isNumber = scanner.hasNextInt();
            if (isNumber) {
                int a = scanner.nextInt();
                System.out.printf("Enter the numbers : ");

                    int[] c = setIntegers(a);
                    getArray(c);
                    sortArray(c);
                    flag = false;

            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        scanner.close();
        }

    public static int[] setIntegers(int a){
        int[] arr= new int[a];
        for(int i=0; i<arr.length; i++){
            boolean isNum=scanner.hasNextInt();
            if(isNum) {
                arr[i] = scanner.nextInt();
            }
            else{
                System.out.println("invalid number");
            }
            scanner.nextLine();
            }
        return arr;
    }

    public static void getArray(int[] array){
        for(int i=0; i< array.length; i++) {
            System.out.println("Interger"+(i+1)+" = "+array[i]);
        }
    }

    public static void sortArray(int[] Array){
        int min=Array[0];
        for(int i=0; i< Array.length; i++){
            for(int j=i+1; j< Array.length;j++){
                if(Array[i]< Array[j]){
                    min=Array[i];
                    Array[i]= Array[j];
                    Array[j]=min;
                }
            }
        }
        int k=0;
        System.out.printf("Sorted elements : ");
        while(k<Array.length) {
            System.out.printf(Array[k]+" ");
            k++;
        }
    }

}
