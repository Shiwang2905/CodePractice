package main.java.Oops;

public class Main {
    public static void main(String[] args) {
        Resolution r= new Resolution(1920,1080);
        Monitor mon= new Monitor("Samsung",r);
        Case ca= new Case(0.5,9,12);
        CPU cpu= new CPU(8,"Intel i5 9th gen",5.0);
        PC mypc= new PC(ca,cpu,mon);
        System.out.println(mypc.getBox());
        System.out.println(mypc.getCpu().getClockSpeed());
        mypc.getCpu().runCPU(4.2);
        System.out.println(mypc.getCpu().getProcessor());
        System.out.println(mypc.getMonitor().getRes().getLen());
        System.out.println(mypc.getMonitor().getRes().getBre());
        System.out.println(mypc.getMonitor().getManufacturer());

    }
}
