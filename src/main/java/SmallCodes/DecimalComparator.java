public class DecimalComparator {
    public static void main(String[] args) {
    boolean result=areEqualByThreeDecimalPlaces(0.0,0.0);
        System.out.println(result);
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2){

        num1=num1*1000;
        int f1=(int)num1;

        num2=num2*1000;
        int f2=(int)num2;
        if(f1==f2){
            return true;
        }
        return false;
        }

    }

