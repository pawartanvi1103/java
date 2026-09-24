import java.util.Scanner;
public class ATMWithdrwal{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter amount you want to withdrwal :");
 int x = sc.nextInt();
  System.out.println("Enter the initial balnce :");
  double y = sc.nextDouble();
 
 if(x % 5 == 0 && x + 0.05 <= y)
    y = y - x - 0.05;
 System.out.printf("%.2f",y);
}
} 
 
