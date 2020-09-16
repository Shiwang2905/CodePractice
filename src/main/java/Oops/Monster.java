package main.java.Oops;

import java.util.ArrayList;
import java.util.List;

public class Monster implements Isaveable {
    private String name;
    private int Hitpoints;
    private int damage;
    private String weapon;

    public Monster(String n, int H, int D){
        this.name=n;
        this.Hitpoints=H;
        this.damage=D;
        this.weapon=" Nails " ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitpoints() {
        return Hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        Hitpoints = hitpoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Monster {"+
                "Name= '"+this.name+
                "' , " + "HitPoints ='"+this.Hitpoints+
                "' , Damage ='"+this.damage +
                "' Weapon = '"+this.weapon+"'}";
    }

    @Override
    public void read(List<String> savedvalues) {
        if(savedvalues!=null & savedvalues.size()>0){
            this.name=savedvalues.get(0);
            this.Hitpoints=Integer.parseInt(savedvalues.get(1));
            this.damage=Integer.parseInt(savedvalues.get(2));
            this.weapon=savedvalues.get(3);
        }
    }

    @Override
    public List<String> write() {
        List<String> inputs= new ArrayList<String>();
        inputs.add(0,this.name);
        inputs.add(1,""+this.Hitpoints);
        inputs.add(2,""+this.damage);
        inputs.add(3,this.weapon);
        return inputs;
    }
}
