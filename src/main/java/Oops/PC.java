package main.java.Oops;

public class PC {
    private Case box;
    private CPU cpu;
    private Monitor monitor;

    public PC (Case box, CPU cpu, Monitor monitor){
        this.box=box;
        this.cpu=cpu;
        this.monitor=monitor;
    }

    public Case getBox() {
        return box;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Monitor getMonitor() {
        return monitor;
    }

}
