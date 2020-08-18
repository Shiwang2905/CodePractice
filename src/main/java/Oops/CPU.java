package main.java.Oops;

public class CPU {
    private int ram;
    private String processor;
    private double maxclockSpeed;

    public CPU(int r, String pro, double cs){
        this.ram=r;
        this.processor=pro;
        this.maxclockSpeed=cs;
    }

    public int getRam() {

        return ram;
    }

    public String getProcessor() {

        return processor;
    }

    public double getClockSpeed() {

        return maxclockSpeed;
    }
    public void runCPU(double c){
        if(c<5&& c>0) {
            System.out.println("CPU is running at " + c + " G/hz");
        }
        }

}
