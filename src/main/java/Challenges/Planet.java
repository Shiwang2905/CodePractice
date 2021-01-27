package main.java.Challenges;

public class Planet extends HeavenlyBody{

    public Planet(String pname, double orbPeriod) {
        super(pname,orbPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody hb) {
        if(hb.getKey().getBodyType()==BodyTypes.MOON){
            return super.addSatellite(hb);
        }
        else {
            return false;
        }
        }
}
