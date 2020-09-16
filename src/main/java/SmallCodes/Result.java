package main.java.SmallCodes;

public class Result {
    public static void main(String[] args) {
        Carpet c=new Carpet(3.5);

        Floor f= new Floor(2.75,4.0);

        Calculator Cal= new Calculator(f,c);
        System.out.println(Cal.getTotalCost());

         c=new Carpet(1.5);
        f= new Floor(5.4,4.5);
        Calculator cal= new Calculator(f,c);
        System.out.println(cal.getTotalCost());
    }
}
