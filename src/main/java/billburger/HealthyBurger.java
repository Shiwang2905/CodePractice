package main.java.billburger;

public class HealthyBurger extends Hamburger{
    private String Hex1name;
    private double Hex1price;
    private String Hex2name;
    private int Hex2price;

    public HealthyBurger(String hex1name, String hex2name){
        super("brownbread","red meat","Basic Burger");
        this.Hex1name=hex1name;
        this.Hex1price=10;
        this.Hex2name=hex2name;
        this.Hex2price=20;
    }

    public String getHex1name() {
        return Hex1name;
    }

    public double getHex1price() {
        return Hex1price;
    }

    public String getHex2name() {
        return Hex2name;
    }

    public int getHex2price() {
        return Hex2price;
    }

    @Override
    public double CalculatePrice() {

        double Tprice= super.CalculatePrice();
        if(getHex1name()!=null) {
                Tprice+=getHex1price();
            System.out.println(getHex1name() + " = " + getHex1price());
        }
        if(getHex2name()!=null) {
            Tprice+=getHex2price();
            System.out.println(getHex2name() + " = " + getHex2price());
        }

        return Tprice;

    }
}

