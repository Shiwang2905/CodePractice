package main.java.Oops;

public class Operations {
    public static void main(String[] args) {

        Circle c1= new Circle(3.75);
        System.out.println("circle radius = "+c1.getRadius());
        System.out.println("circle area = "+c1.getArea());
        Cylinder c2= new Cylinder(5.55,7.25);
        System.out.println("Cylinder radius = "+c2.getRadius());
        System.out.println("Cylinder height = "+c2.getHeight());
        System.out.println("Cylinder area = "+ c2.getArea());
        System.out.println("volume = "+c2.getVolume());
    }


}
