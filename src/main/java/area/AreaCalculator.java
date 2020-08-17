package main.java.area;

public class AreaCalculator {
    public static void main(String[] args) {
        double result1=area(3.5);
        double result2=area(5,4);
        System.out.println(result1);
        System.out.println(result2);
    }
    public static double area(double radius){
        if(radius<0){
            return -1.0;
        }
    double Area=radius*radius*Math.PI;
    return Area;
    }
    public static double area(double a, double b){
        if(a<0||b<0){
            return -1.0;
        }
        double Rarea= a*b;
        return Rarea;
    }
}
