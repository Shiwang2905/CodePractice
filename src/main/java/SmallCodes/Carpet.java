package main.java.SmallCodes;

public class Carpet {
    private double cost;

    public Carpet(double Cost){
        if(Cost<0){
            this.cost=0;
        }
        else {
            this.cost=Cost;
        }
    }

    public double getCost(){
        return cost;
    }
}
