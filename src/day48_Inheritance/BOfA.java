package day48_Inheritance;

public class BOfA {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount("Ramazan", "Alic");
        obj.setAccountHolder(obj.firstName+" "+obj.lastName);
        obj.setAccountNumber(123456789);
        obj.setBalance(50);

        obj.availableBalance();
        obj.deposit(500);
        obj.availableBalance();

        obj.withdraw(700);

        obj.withdraw(-200);

        obj.withdraw(0);

        obj.withdraw(300);
        obj.availableBalance();

        obj.deposit(1000000);

        System.out.println(obj);

    }
}
