package main.java.Collections;

public abstract class Player {
    private String PlayerName;

    public Player(String name){
        this.PlayerName=name;
    }

    public String getPlayerName() {
        return PlayerName;
    }
}
