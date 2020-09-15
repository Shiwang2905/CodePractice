package main.java.Oops;

public class PhoneApp implements ItelePhone {
    private int phoneNum;
    private boolean Ring;
    private boolean phoneStatus;

    PhoneApp (int num){
        this.phoneNum=num;
    }

    @Override
    public void call(int phoneNumber) {
        if(phoneStatus) {
            System.out.println("Calling phoneNumber " + phoneNumber);
        }
        }

    @Override
    public void dial(int phoneNumber) {
        if(phoneStatus) {
            System.out.println(phoneNumber + " has been dialed");
        }

        }

    @Override
    public boolean isRinging(int phoneNumber) {
        if(phoneStatus) {
            if (phoneNum == phoneNumber) {
                Ring = true;
                System.out.println("Calling your number");
            } else {
                Ring = false;
                System.out.println("Couldn't make call to " + phoneNumber);
            }
        }
        return Ring;
    }

    @Override
    public boolean answer() {
        if(Ring){
            System.out.println("pickup the call");
        }
        else{
            Ring=false;
        }
        return Ring;
    }

    @Override
    public boolean powerOn(boolean OnOff) {
        if(OnOff) {
            System.out.println("phone is starting");
            phoneStatus=true;
        }
        else {
            phoneStatus=false;
            System.out.println("Phone is off. \n" +
                    "Press and Hold power button to start the phone and make call.");
        }
        return phoneStatus;
        }

}
