package main.java.Oops;

public class Cuboid extends Rectangle {
    private double height;
    public Cuboid(double width, double length, double height){
        super(length, width);
        if(height<0){
            this.height=0;
            return;
        }
        this.height=height;
    }

    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getArea()*getHeight();
    }
}
