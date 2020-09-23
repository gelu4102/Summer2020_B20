package day48_Inheritance;

public class BankAccount {

    public String firstName;
    public String lastName;

    public BankAccount(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public static String bankName;
    static {
        bankName = "Bank Of America";
    }

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        System.out.println("Depositing: $"+amount);
        balance += amount;
    }

    public void withdraw(double amount){

        if (amount <= 0){
            System.out.println("Invalid amount");
            return;
        }

        if (amount > balance){
            System.out.println("Not enough balance");
            return;
        }
        System.out.println("Withdrawing: $"+amount);
        balance -= amount;
    }

    public void availableBalance(){
        System.out.println("Available Balance: $"+ getBalance());
    }

    public String toString() {
        return bankName +
                "\n===================================================" +
                "\n" + firstName + " " + lastName +
                "\nAccount Number: " + getAccountNumber() +
                "\n===================================================" +
                "\nBalance: $" + getBalance();
    }




    }
