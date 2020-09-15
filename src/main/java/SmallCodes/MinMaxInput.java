import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class MinMaxInput {
    public static void main(String[] args) {
        Scanner Result= new Scanner(System.in);
        int i=1;

        int min = 0;
        int max = 1;
        int count=0;
        while(i>0) {
            if(i==11){
                System.out.println("Minumum Number = "+min);
                System.out.println("Maximum Number = "+max);
                return;
            }
            System.out.print("Enter number" + i +" : ");
            boolean num=Result.hasNextInt();

            if(num){
                int number1=Result.nextInt();
                count++;
                if(number1<0){
                    System.out.println("Invalid Number");
                    System.out.println("Minumum Number = "+min);
                    System.out.println("Maximum Number = "+max);
                    return;
                }
                if(count==1){
                    max=number1;
                    min=number1;
                }
                if(count>1) {
                    if (number1 > max) {
                        max = number1;
                    }
                    else if(number1<min){
                        min=number1;
                    }
                }
                i++;

            }
            else {
                System.out.println("Invalid Number");
                System.out.println("Minumum Number = "+min);
                System.out.println("Maximum Number = "+max);
                return;
            }
            Result.nextLine();
        }
        Result.close();
    }
}
