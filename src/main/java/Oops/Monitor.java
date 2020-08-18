package main.java.Oops;

public class Monitor {
    private String manufacturer;
    private Resolution res;

    public Monitor(String manufac, Resolution resolution){
        this.manufacturer=manufac;
        this.res=resolution;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Resolution getRes() {
        return res;
    }
}
