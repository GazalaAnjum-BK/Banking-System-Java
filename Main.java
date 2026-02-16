import java.util.Scanner;
public class Main{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
          System.out.println("Enter account holder name: ");
          String name=sc.nextLine();
        BankAccount account=new BankAccount(0,name,500.00,78671);
        boolean authenticated=false;
        while(!authenticated){
          for(int i=0;i<3;i++){
               System.out.println("Enter your pin: ");
                int enteredPin=sc.nextInt();
                if(account.validatePin(enteredPin)){
                    authenticated=true;
                    break;
                }else{
                    System.out.println("Wrong PIN");
                    System.out.println("Atempts left: "+(2-i));
                }
          }
          if(!authenticated){
               System.out.println("Account locked for 10 seconds...");
               try{
                    Thread.sleep(10000);
               }catch (InterruptedException e){
                    e.printStackTrace();
               }
               System.out.println("you may try again");
          }
     }
        int choice;
        do{
            System.out.println("\n===BANK MENU ====");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.check Balance");
            System.out.println("4.Exit");
             System.out.println("Enter your choice:");

             choice =sc.nextInt();
             switch(choice){
                case 1:
                     System.out.println("Enter amount to deposit");
                     double depositAmount=sc.nextDouble();
                     account.deposit(depositAmount);
                     break;

                case 2:
                     System.out.println("Enter amount withdraw");     
                     double withdrawAmount=sc.nextDouble();
                     account.withdraw(withdrawAmount);
                     break;

                case 3:
                     account.displayBalance();
                     break;

                case 4:
                     System.out.println("Thank you for using our bank");
                     break;
                
                default:
                     System.out.println("Invalid choice");
             }

        }
        while(choice!=4);
        sc.close();

        
    }
}
