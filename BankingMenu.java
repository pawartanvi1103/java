import java.util.Scanner;
public class BankingMenu{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
  
 double balance = 5000;

 System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

 int choice = sc.nextInt();
 switch(choice){
   case 1:
     System.out.println("Enter deposit amount :");
     double deposit = sc.nextDouble();
     balance = balance + deposit;
     System.out.println("New Balance =" +balance);
     break;

   case 2:
     System.out.println("Enter withdrawal amount :");
     double withdraw = sc.nextDouble();

   if(withdraw <= balance){
      balance  = balance - withdraw;
      System.out.println("New Balance=" + balance);
}   
 else
   System.out.println("Insufficient balance");
   break;
  
 case 3:
    System.out.println("Balance=" + balance);
    break;

 case 4:
     System.out.println("Thank you");
     break;

 default:
    System.out.println("Invalid choice");
}
}
}