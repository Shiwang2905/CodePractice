package main.java.loopchallenges;

public class DigitSumChallenge {
    public static void main(String[] args) {
        int result = sumDigits(32123);
        System.out.println(result);
    }
    public static int sumDigits(int a) {
        if (a < 0 || a <= 9 && a >= 1) {
            return -1;
        }
        int sum = 0;
        while (a > 0) {
            sum = sum + a % (10);
            a = a / 10;
        }
        return sum;
    }
}
