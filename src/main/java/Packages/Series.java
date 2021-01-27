package main.java.Packages;

public class Series {

    public void nSum(int n) {
        if (n > 0) {
            int sum = 0;
            int start = 0;
            while (start <= n) {
                sum = sum + start;
                System.out.print(sum + " ");
                start++;
            }
        } else {
            System.out.println("enter the correct number");
        }
    }

    public void Factorial(int n) {
        if(n>0) {
            int a = 0;
            while (a <= n) {
                int fact = 1;
                int b = 1;
                while (b <= a) {
                    fact = fact * b;
                    b++;
                }
                System.out.print(fact + " ");
                a++;
            }
        }
        else {
            System.out.println("you have entered invalid number . Please enter any number greater than 0");
        }
    }

    public void Fibonacci(int n) {
     if(n>0){
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        for (int i = 0; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
        else {
            System.out.println("you have entered invalid number . Please enter any number greater than 0");
        }
    }
}