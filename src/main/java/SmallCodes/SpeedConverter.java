public class SpeedConverter {
    public static void main(String[] args) {

        printConversion(100.4);


    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour <0) {
            return -1;
        }
        long milePerHour=(long)(kilometersPerHour/1.609);
        float pointNumber=(float)(kilometersPerHour/1.609);
        float Remainder=(float)(pointNumber-milePerHour);
        if(Remainder>=0.5){
            milePerHour++;
        }
        return milePerHour;
    }

    public static void printConversion(double kilometersPerHour) {
        long result = toMilesPerHour(kilometersPerHour);
        if (result < 0) {
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kilometersPerHour + " km/h = " + result + " mi/h");
    }
}
