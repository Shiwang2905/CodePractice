package main.java.loopchallenges;

public class SumOdd {
    public static void main(String[] args) {
        int num = sumOdd(10, 5);
        System.out.println(num);
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0) {
            return -1;
        }
        int sum = 0;
        if (end >= start) {
            for (; start <= end; start++) {


                boolean result = isOdd(start);
                if (result) {
                    sum += start;
                }


            }
            return sum;
        } else {
            return -1;
        }

    }
}
