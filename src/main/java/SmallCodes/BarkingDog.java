public class BarkingDog {
    public static void main(String[] args) {
            boolean wakeup=shouldWakeUp(false,2);
        System.out.println(wakeup);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay ){
        if(barking) {
            if (hourOfDay < 0 || hourOfDay >=24) {
                return false;
            }
            else if(hourOfDay>=8 && hourOfDay<22){
                return false;
            }
            else if (hourOfDay >= 0 && hourOfDay < 8 || hourOfDay >22 && hourOfDay <24) {
                return true;
            }

        }
        return false;
    }
}
