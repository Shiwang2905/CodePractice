package main.java.Collections;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String Tname;
    int won=0;
    int lost=0;
    int tie=0;
    private ArrayList<T> team= new ArrayList<>();
    public Team(String tname) {
        Tname = tname;
    }

    public String getTname() {
        return Tname;
    }

    public int points(){
        return won*2+tie;
    }

    public boolean addPlayer(T p){
        if(team.contains(p)) {
            System.out.println((p).getPlayerName()+" is already in team");
        }
        else {
            team.add(p);
            return true;
        }
        return false;
    }

    public void matchResult(Team<T> opponent, int ourScore, int opponentScore){
        String message;
        if(ourScore>opponentScore){
            won++;
            message=" beat ";
        }
        else if(ourScore<opponentScore){
            lost++;
            message=" lost to ";
        }
        else {
            tie++;
            message=" tie with ";
            }
        if(opponent!=null){
            System.out.println(this.Tname+message+opponent.getTname());
            matchResult(null,opponentScore,ourScore);
        }

    }

    public void traverse(){
        for(int i=0; i<team.size(); i++){
            System.out.println(team.get(i).getPlayerName());
        }
    }
}
