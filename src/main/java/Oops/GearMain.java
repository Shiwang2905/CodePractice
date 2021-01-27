package main.java.Oops;

public class GearMain {
    public static void main(String[] args) {
        GearBox tvs = new GearBox(5);
        tvs.addGear(1, 1.5);
        tvs.addGear(2, 2.5);
        tvs.addGear(3, 3.8);
        tvs.addGear(4, 5.0);
        tvs.addGear(5,6.5);

        tvs.OperateClutch(true);
        tvs.changeGear(2);
        tvs.speed(20);
    }
}
