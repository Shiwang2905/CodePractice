package main.java.billburger;

public class Hamburger {
    private String BreadRollType;
    private String meat;
    private int Baseprice;
    private String name;

    public Hamburger(String bread, String meat, String name){
        this.BreadRollType=bread;
        this.meat=meat;
        this.Baseprice=40;
        this.name=name;

    }
    private String add1Name;
    private double add1Price;

    private String add2Name;
    private double add2Price;

    private String add3Name;
    private double add3Price;

    private String add4Name;
    private double add4Price;

     public void AddHam1items(String name){
         this.add1Name=name;
         this.add1Price=10;
     }
    public void AddHam2items(String name){
        this.add2Name=name;
        this.add2Price=15;
    }
    public void AddHam3items(String name){
        this.add3Name=name;
        this.add3Price=20;
    }
    public void AddHam4items(String name){
        this.add4Name=name;
        this.add4Price=25;
    }

    public String getBreadRollType() {
        return BreadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public int getBaseprice() {
        return Baseprice;
    }

    public String getName() {
        return name;
    }

    public String getAdd1Name() {
        return add1Name;
    }

    public double getAdd1Price() {
        return add1Price;
    }

    public String getAdd2Name() {
        return add2Name;
    }

    public double getAdd2Price() {
        return add2Price;
    }

    public String getAdd3Name() {
        return add3Name;
    }

    public double getAdd3Price() {
        return add3Price;
    }

    public String getAdd4Name() {
        return add4Name;
    }

    public double getAdd4Price() {
        return add4Price;
    }

    public double CalculatePrice(){
        System.out.println("Your Burger = "+getName());
        System.out.println("Bread type = "+getBreadRollType());
        System.out.println("meat = "+getMeat());
        System.out.println("Baseprice = "+getBaseprice());
        double totalprice=getBaseprice();
        if(getAdd1Name()!=null) {
            totalprice+=+getAdd1Price();
            System.out.println(getAdd1Name()+" = "+getAdd1Price());
        }
        if(getAdd2Name()!=null) {
            totalprice+=+getAdd2Price();
            System.out.println(getAdd2Name()+" = "+getAdd2Price());
        }
        if(getAdd3Name()!=null) {
            totalprice+=+getAdd3Price();
            System.out.println(getAdd3Name()+" = "+getAdd3Price());
        }
        if(getAdd4Name()!=null) {
            totalprice+=+getAdd4Price();
            System.out.println(getAdd4Name()+" = "+getAdd4Price());
        }


        return totalprice;
    }
}
