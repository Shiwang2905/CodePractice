package main.java.SmallCodes;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
    boolean Result=isLeapYear(2000);
        System.out.println(Result);
        int answer=getDaysInMonth(-1,2000);
        System.out.println(answer);
    }
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year < 9999) {
            if(year%400==0){
                return true;
            }
            else if(year%100==0){
                return false;
            }
            else if(year%4==0){
                return true;
            }
        }
        return false;

    }
    public static int getDaysInMonth(int months, int year){
        if(months<=0 || months>13 || year<0 || year>9999){
            return -1;
        }

        switch (months) {

            case 1:
                return 31;

            case 2:
                boolean result=isLeapYear(year);
                if(result) {
                    return 29;
                }
                else {
                    return 28;
                }


            case 3:
                return 31;

            case 4:
                return 30;

            case 5:
                return 31;

            case 6:
                return 30;

            case 7:
                return 31;

            case 8:
                return 31;

            case 9:
                return 30;

            case 10:
                return 31;

            case 11:
                return 30;

            case 12:
                return 31;

            default:
                       return -1;


        }

        }

}
