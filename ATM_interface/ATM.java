import java.util.*;
public class ATM{
     float Balance;
     int PIN = 2356;

     public void checkpin(){
          System.out.println("Enter your pin:");
          Scanner sc = new Scanner(System.in);
          int enteredpin = sc.nextInt();
          if(enteredpin==PIN){
               menu();

          } else{
               System.out.println("Your pin is INVALID");
          }
          sc.close();
     }

     public void menu(){
       System.out.println("Enter Your Choice:");
       System.out.println("1. Check A/c Balance");
       System.out.println("2. Withdraw Money");
       System.out.println("3. Deposit Money");
       System.out.println("4. Exit");


       Scanner sc =new Scanner(System.in);
       int opt = sc.nextInt();
       if(opt == 1){
          checkBalance();
       } else if(opt == 2){
          withdrawMoney();
       } else if(opt == 3){
          depositMoney();

       } else if(opt == 4){
          return;
       }
       else{
          System.out.println("Enter a valid choice");
       }
    


          }
          public void checkBalance(){
               System.out.println("Balance: " + Balance);
               menu();
          }
          public void withdrawMoney(){
               System.out.println("Enter your amount to withdraw:");
               Scanner sc = new Scanner(System.in);
               float amount = sc.nextFloat();
               if(amount>Balance){
                  System.out.println("Insuffecient Balance");
               }
               else{
                    Balance = Balance - amount;
                    System.out.println("Withdrawn Sucessfully");
               }
               menu();
               sc.close();
          }
          public void depositMoney(){
             System.out.println("Enter the Amount");
              Scanner sc = new Scanner(System.in);
               float amount = sc.nextFloat();
               Balance = Balance + amount;
               System.out.println("Deposited Sucessfully");
               sc.close();
          }
          public static void main(String[]args){
          ATM obj = new ATM();
          obj.checkpin();
    }
}
