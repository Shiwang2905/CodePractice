import java.util.Scanner;

public class DiagonalBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int num = scanner.nextInt();
        printSquareStar(num);

    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {

                if (i == 1 && j <= number || i == number && j <= number || i <= number && j == 1 || i <= number && j == number || i == j) {
                    System.out.print("*");
                } else if (i + j == number + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
