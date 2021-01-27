package main.java.Oops;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGear;
    private int currentGear=0;
    private boolean ClutchesIn;

    public GearBox (int mGear){
        this.gears= new ArrayList<Gear>();
        this.maxGear=mGear;
        Gear neutral= new Gear(0,0.0);
        gears.add(neutral);
    }

    public boolean OperateClutch(boolean action){
        this.ClutchesIn=action;
        return ClutchesIn;
    }

    public void addGear(int gearNumber, double ratio){
        if(gearNumber>0 && gearNumber<=maxGear){
            this.gears.add(new Gear(gearNumber,ratio));
            System.out.println(gearNumber+" Gear added");
        }
    }

    public void changeGear(int gear){
        if(gear>0 && (gear<=this.gears.size() &&this.ClutchesIn)){
            this.currentGear=gear;
            System.out.println("Gear changed to "+ currentGear);
        }
        else {
            System.out.println("Grinddd.....");
            this.currentGear=0;
        }
    }

    public double speed(int rev){
        if(ClutchesIn){
            System.out.println(rev * gears.get(currentGear).getRatio());
        }
        return 0.0;
        }

    private class Gear {
        private int gearNumber;
        private double ratio;

        public double getRatio() {
            return ratio;
        }

        public Gear(int gear, double r){
            this.gearNumber=gear;
            this.ratio=r;
        }
        public double rev(int speed){
            return speed*(this.ratio);
        }
    }
}
