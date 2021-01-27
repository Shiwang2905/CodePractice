package main.java.Challenges;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final Key key;
    private final double OrbitalPeriod;
    private final Set<HeavenlyBody> satellites;


    public enum BodyTypes{
        PLANET,
        MOON
    }
    public HeavenlyBody( String name,double period, BodyTypes bodytype){
        this.key= new Key(name,bodytype);
        this.OrbitalPeriod=period;
        this.satellites= new HashSet<>();
    }

    public double getOrbitalPeriod() {
        return OrbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    public boolean addSatellite(HeavenlyBody moon){
            return this.satellites.add(moon);
        }

    @Override
    public final boolean equals(Object obj) {

        if(this==obj){
            return true;
        }
        if(obj instanceof HeavenlyBody){
            HeavenlyBody object= (HeavenlyBody)obj;
                return this.key.equals(object.getKey());
            }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyTypes bodyType) {
        return new Key(name, bodyType);
    }

    @Override
    public String toString() {
        return this.key.name+ ": " + this.key.bodytype+  ": " +this.getOrbitalPeriod();
    }


    public Key getKey(){
        return key;
    }

    public static final class Key{
        private final String name;
        private BodyTypes bodytype;

        public Key(String n, BodyTypes bt){
            this.name=n;
            this.bodytype=bt;
        }
        public BodyTypes getBodyType() {
            return bodytype;
        }

        public String getName(){
            return name;
        }

        @Override
        public boolean equals(Object obj) {
                Key KEY= (Key)obj;
                if(this.name.equals(KEY.getName())){
                    return (this.bodytype==KEY.getBodyType());
                }
                return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 56+ this.bodytype.hashCode();
        }

        @Override
        public String toString() {
            return this.name +": "+ this.bodytype;
        }
    }

}
