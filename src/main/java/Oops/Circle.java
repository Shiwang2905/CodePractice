package main.java.Oops;

public class Circle {
    private double radius;

    public Circle(double radius){
        if(radius<0){
            this.radius=0;
            return;
        }
            this.radius = radius;

    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        double Area=(getRadius()*getRadius())*Math.PI;
        return Area;
    }

}
