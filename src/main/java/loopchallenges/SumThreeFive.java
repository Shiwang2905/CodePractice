package main.java.loopchallenges;

public class SumThreeFive {
    public static void main(String[] args) {
        for(int i=1 ,count=0,sum=0; i<=1000; i++){
            if(i%3==0 && i%5==0){
                System.out.println("Numbers divided by 3 & 5 ="+i);
                sum=sum+i;
                count++;
                if(count==5){
                    System.out.println("sum of the numbers = "+sum);
                    break;
                }
            }


        }

    }
}
