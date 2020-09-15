import java.util.Scanner;

public class Inputcalculator {
    public static void main(String[] args) {
    inputThenPrintSumAndAverage();

    }
    public static void inputThenPrintSumAndAverage(){
        Scanner my=new Scanner(System.in);
        System.out.println();

        int count=0;
        int sum=0;
        float avg=0;
        while(true){
            boolean Num=my.hasNextInt();
            if(Num){
                int number=my.nextInt();
              count++;
                sum=sum+number;
                avg=((float)sum/count);

            }
            else{
                System.out.println("SUM = "+sum+" AVG = "+Math.round(avg));
                break;
            }
            my.nextLine();
        }
    }
}
