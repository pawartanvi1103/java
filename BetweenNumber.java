import java.util.Scanner;
public class BetweenNumber{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter two numbers :");
 int a = sc.nextInt();
 int b = sc.nextInt();

 System.out.println("Enter a number you want to check :");
 int n = sc.nextInt();
 
if(n >= a && n <=b){
   System.out.println("n + is between" + a + "and" + b + " . ");
}else {
    System.out.println("n + is not between" + a + "and" + b + " . ");
 
}
}
}