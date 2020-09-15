public class VipCustomer {
    private String name;
    private int CreditLimit;
    private String emailAdd;

    public VipCustomer() {
        this("None", 20000, "abc@gmail.com");
    }
    public VipCustomer(String Name, int Limit){
        this(Name,Limit,"microsoft@com");

    }
    public VipCustomer(String Cname, int Climit, String Cemail){
        this.name=Cname;
        this.CreditLimit=Climit;
        this.emailAdd=Cemail;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return CreditLimit;
    }

    public String getEmailAdd() {
        return emailAdd;
    }
}
