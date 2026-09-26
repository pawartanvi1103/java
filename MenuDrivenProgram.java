import java.util.Scanner;
public class MenuDrivenProgram{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("positive / negative / zero");
  System.out.println("even / odd");
  System.out.println("Max between two numbers ");

 int choice = sc.nextInt();
 
 switch(choice){
      case 1:
         System.out.println("Enter the number :");
         int n =sc.nextInt();
         if(n > 0)
            System.out.println("positive");
         else if( n < 0)
            System.out.println("Negative");
         else
            System.out.println("Zero");
         break;
   
      case 2:
          System.out.println("Enter the number :");
          int x = sc.nextInt();
          if(x % 2== 0)
             System.out.println("Even");
          else 
             System.out.println("Odd");
          break;

       case 3:
         System.out.println("Enter the two numbers :");
         int a = sc.nextInt();
         int b = sc.nextInt();
         if(a > b)
            System.out.println("Maximum=" + a);
         else
            System.out.println("Maximum=" +b);
         break;

       default :
         System.out.println("Invalid choice");



}
}
}