import java.util.Scanner;
public class Membership{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter your membership type (1 for Premium, 2 for Regular, 0 for None)");
 int type = sc.nextInt();

 if(type == 1)
    System.out.println("You got 20% discount.");
else if(type == 2)
    System.out.println("You got a 10 % discount.");
else
    System.out.println("No discount");
}
}