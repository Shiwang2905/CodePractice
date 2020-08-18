package main.java.Oops;

public class Case {
    private double width;
    private double height;
    private double length;

    public Case (double w, double h, double l){
        this.width=w;
        this.height=h;
        this.length=l;
        System.out.println("case is manufactured");

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

}
