package main.java.area;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber( double Real, double Imaginary){
        this.real=Real;
        this.imaginary=Imaginary;
    }
    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }
    public void add(double real, double imaginary){
        this.real+=real;
        this.imaginary+=imaginary;
    }
    public void add(ComplexNumber num){
        this.real+=num.real;
        this.imaginary+=num.imaginary;
    }
    public void subtract(double real, double imaginary){
        this.real-=real;
        this.imaginary-=imaginary;
    }
    public void subtract(ComplexNumber num){
        this.real-=num.real;
        this.imaginary-= num.imaginary;
    }
}
