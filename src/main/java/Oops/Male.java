package main.java.Oops;

public class Male extends Human {
    private int eyes;
    private String MRS;
    private int legs;

    public Male( double weight,int eyes,String mrs, int Leg){
        super("One",1,2,"one",weight);
        this.eyes=2;
        this.MRS=mrs;
        this.legs=Leg;
    }
    public int getEyes(){
        return eyes;
    }
    public void move(int Sp){
        System.out.println("walks at "+Sp);
    }
    public void eat(){
        System.out.println("Male is eating");
    }
    public void sleep(){
        System.out.println("male is sleeping");
        super.sleep();
    }


}
