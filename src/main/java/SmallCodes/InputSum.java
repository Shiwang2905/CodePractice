import java.util.Scanner;

public class InputSum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 10; i++) {

            System.out.print("Enter the number" + i + ": ");

            boolean result = obj.hasNextInt();


            if (result) {
                int num = obj.nextInt();
                if (num < 0) {
                    System.out.println("Invalid Number");
                    System.out.println("sum of all the numbers till now: " + sum);

                    return;
                }
                sum = sum + num;
            }
            else {
                System.out.println("Invalid Number");
                i--;
            }
            obj.nextLine();
            if (i == 10) {
                System.out.println("sum of all the numbers is: " + sum);
            }
        }
        obj.close();
    }
}
