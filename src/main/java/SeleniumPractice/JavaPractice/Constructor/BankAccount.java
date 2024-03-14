package SeleniumPractice.JavaPractice.Constructor;

public class BankAccount {

    String accNumber;
    double balance;


    BankAccount(String accNumber,double balance)
    {
        this.accNumber=accNumber;
        this.balance=balance;
    }

    public void deposit(double amount)
    {
        balance=balance+amount;
    }
    public void withdraw(double amount)
    {
        balance=balance-amount;
    }

    public static void main(String[] args) {
        BankAccount b=new BankAccount("123456123456",10000);
        b.deposit(100);
        System.out.println(b.balance);
        b.withdraw(1000);
        System.out.println(b.balance);
        b.withdraw(1000);
        System.out.println(b.balance);
        b.deposit(200);
        System.out.println(b.balance);



    }


}
