package main.java.Collections;

public class TeamMain {
    public static void main(String[] args) {
        AustralianPlayer ausie= new AustralianPlayer("Watson");
        IndianPlayer bengaluru= new IndianPlayer("Kohli");
        IndianPlayer mumbai= new IndianPlayer("Rohit");
        NzPlayer nz= new NzPlayer("Williamson");
        Team<AustralianPlayer> ausie2= new Team<>("kangaroos");
        Team<AustralianPlayer> australia= new Team<>("Batsman");
        australia.addPlayer(ausie);
        Team<IndianPlayer> rcb= new Team<>("RCB");
        australia.matchResult(ausie2,300,350);
        rcb.addPlayer(bengaluru);
        Team<IndianPlayer> Mumbai= new Team<>("Mumbai indians");
        Mumbai.addPlayer(mumbai);
       rcb.matchResult(Mumbai,180,160);
        System.out.println(rcb.getTname()+" "+rcb.points());
        System.out.println(Mumbai.getTname()+" "+Mumbai.points());

    }
}
