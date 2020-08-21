package main.java.Arrays;

import java.util.Scanner;

public class Calender {

    static Scanner UserInput= new Scanner(System.in);

        public  static void putInput(){
            System.out.printf("Enter the date : ");
            System.out.println();

            int date=UserInput.nextInt();
            UserInput.nextLine();
            System.out.printf("Enter the month : ");
            System.out.println();
            int month=UserInput.nextInt();
            getDay(date);
            getMonth(month);
        }
        public static void getDay(int date){
            if(date<=0 || date>32){
                System.out.println("Enter valid date ..!!");
                return;
            }
            date%=7;
            switch (date){
                case 1:
                    System.out.printf("Monday ");
                    break;
                case 2:
                    System.out.printf("Tuesday ");
                    break;
                case 3:
                    System.out.printf("wednesday ");
                    break;
                case 4:
                    System.out.printf("Thursday ");
                    break;
                case 5:
                    System.out.printf("Friday ");
                    break;
                case 6:
                    System.out.print("Saturday ");
                    break;
                case 0:
                    System.out.print("Sunday ");
            }

        }
        public static void getMonth(int month){
            if(month>13 || month<=0){
                System.out.println("Invalid month");
                return;
            }
            switch (month){
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
            }
        }
}
