package main.java.Arrays;

public class Contacts {
    private String PersonName;
    private String PersonMobNumber;

    public void createContact(String name, String mobNumber){
        this.PersonName=name;
        this.PersonMobNumber=mobNumber;
    }

    public String getPersonName() {
        return PersonName;
    }

    public String getPersonMobNumber() {
        return PersonMobNumber;
    }



}
