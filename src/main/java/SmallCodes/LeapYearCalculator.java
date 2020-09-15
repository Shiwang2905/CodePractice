public class LeapYearCalculator {
    public static void main(String[] args) {
        boolean leap = isLeapYear(1924);
        System.out.println(leap);
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
}
