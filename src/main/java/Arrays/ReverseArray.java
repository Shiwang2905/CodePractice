package main.java.Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner Output= new Scanner(System.in);
        int[] array= {10,11,12,13,14};
        RevArray(array);
    }

    static void RevArray(int[] arr){
        System.out.print("Elements in correct order : ");
        for (int k : arr) {

            System.out.print(k + " ");
        }
        System.out.print("\n"+"Elements in reverse order : ");
        for(int j= arr.length-1; j>=0; j--){

            System.out.print(arr[j]+" ");
        }
    }
}
