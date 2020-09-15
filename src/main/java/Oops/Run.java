package main.java.Oops;

public class Run {
    public static void main(String[] args) {
        ItelePhone nokia = new PhoneApp(12345);
        nokia.powerOn(false);
        nokia.dial(12345);
        nokia.call(12345);
        nokia.isRinging(12345);

    }
}
