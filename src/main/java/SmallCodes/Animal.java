package main.java.SmallCodes;

public class Animal {
    private String name;

    public Animal(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }

        if(obj instanceof Animal){
            String objName= ((Animal) obj).getName();
            return this.name.equals(objName);
        }
        return false;
    }

}
