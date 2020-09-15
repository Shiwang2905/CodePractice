public class BankAcc {

    private long AccNumber;
    private String CustomerName;
    private int Balance;
    private String CustomerEmail;
    private long ContactNumber;

    public BankAcc(){
        this(12345, "kumar",100, "abc@gmail",02015);
        System.out.println("Default constructor called");
    }

    public BankAcc(long number, String name, int Bal, String email, long num){

        this.CustomerName=name;
        System.out.println("Customer Name = "+ getCustomerName());
        this.AccNumber=number;
        System.out.println("Customer AccNumber = "+getAccNumber());
        this.Balance=Bal;
        System.out.println("Acc Balance = "+getBalance());
        this.ContactNumber=num;
        System.out.println("Customer Mob No = "+getContactNumber());
        this.CustomerEmail=email;
        System.out.println("Customer Email = "+getCustomerEmail());

    }

    public void setAccNumber(long accNumber){
        this.AccNumber=accNumber;
    }
    public long getAccNumber(){
        return AccNumber;

    }
    public void setCustomerName(String customerName){
        this.CustomerName=customerName;
    }
    public String getCustomerName(){
        return CustomerName;
    }

    public void setBalance(int balance) {
        this.Balance = balance;
    }

    public int getBalance() {
        return Balance;
    }

    public void setCustomerEmail(String customerEmail) {
        this.CustomerEmail = customerEmail;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setContactNumber(long contactNumber) {
        this.ContactNumber=contactNumber;
    }

    public long getContactNumber() {
        return ContactNumber;
    }
    public void desositFunf(int Amount){
        System.out.println("Current Balance = "+getBalance());
        this.Balance+=Amount;
        System.out.println("Updated Balance = "+Balance);
    }
    public void withdrawFund(int DEamount){
        if(getBalance()>=DEamount) {
            Balance = getBalance() - DEamount;
        }
        else {
            System.out.println("Insufficient Balance");
        }
        }
}
