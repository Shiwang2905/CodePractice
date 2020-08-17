package main.java.Oops;

public class Human {
    private String brain;
    private int body;
    private int hand;
    private String mouth;
    private double weight;

    public Human(String brain, int body, int hand, String mouth, double weight){
        this.brain=brain;
        this.body=body;
        this.hand=hand;
        this.mouth=mouth;
        this.weight=weight;
    }

    public void move(int speed){
        System.out.println("Human.move() called");
    }
    public void eat(){
        System.out.println("Human.eat() called");
    }
    public void sleep(){
        System.out.println("Human.sleep() called");
    }

}
