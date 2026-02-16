import java.util.Scanner;
public class BankAccount{
    private int  accountNumber;
    private String accountHolderName;
    private double balance;
    private int pin;


    public double getBalance(){
        return balance;
    }

    public BankAccount(int accountNumber,String accountHolderName,double balance, int pin){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
        this.pin=pin;

    }
    public boolean validatePin(int enteredPin){
        return this.pin==enteredPin;
    }
    
    public void displayBalance()
    {
        System.out.println("Account Holder:"+accountHolderName);
          System.out.println("current Balance:"+balance);
    }
    public void deposit(double amount){
        if (amount<=0){
            System.out.println("Invalid amount.Deposit must be positive");
        }else{
            balance+=amount;
            System.out.println("Deposited:"+ amount);
            System.out.println("CurrentBalance:"+balance);
        }
    }
    public void withdraw(double amount)
    {
        if(amount<=0){
            System.out.println("Invalid amount.withdrawal must be positive");
        }
           else if(amount>balance){
                System.out.println("Insufficient balance");
            }else{
                balance-=amount;
                System.out.println("withdrawn:"+amount);
                System.out.println("current balance:"+balance);
            }
        
    }


}