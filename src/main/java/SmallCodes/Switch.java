package main.java.SmallCodes;

public class Switch {
    public static void main(String[] args) {
        char Newchar= 'A';
            switch (Newchar){
                case 'A':
                    System.out.println("it is "+Newchar);
                    break;
                case 'B':
                    System.out.println("it is "+Newchar);
                    break;
                case 'C':
                        System.out.println("it is "+Newchar);
                        break;
                case 'D':
                    System.out.println("it is "+Newchar);
                    break;

                case 'E':
                    System.out.println("it is "+Newchar);
                    break;

                default :
                    System.out.println("couldn't found");
            break;
            }

    }
    public static void printNumberInWord(int a){
        switch (a){
            case 0:
                System.out.println("ONE");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;

            default:
                System.out.println("OTHER");
                break;
        }

    }
}
