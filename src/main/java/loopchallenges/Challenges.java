package main.java.loopchallenges;

public class Challenges {
    public static void main(String[] args) {
        int num=1;
        while(num<=20){
            num++;
            if(isEvenNumber(num)) {
                System.out.println(num);
            }
        if(num>=20){
            break;
        }
        }

    }
    public static boolean isEvenNumber(int a){
        if(a<0){
            return false;
        }
        if(a%2==0){
            return true;
        }
        else {
            return false;
        }
    }
}
