package main.java.loopchallenges;

public class Palindrome {
    public static void main(String[] args) {
        boolean Check=isPalindrome(-222);
        System.out.println(Check);
    }
    public static boolean isPalindrome(int number){

        if(number<0) {
            number = number - 2 * number;
        }
       int sum = 0;
       int res=0;
       int a=number;
       while(a>0) {
           sum = a% (10);
           res = res* 10+sum;
           a = a / 10;
       }
       if(res==number){
           return true;
       }
       else {
           return false;
       }
       }
}

