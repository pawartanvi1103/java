import java.util.Scanner;
public class sumFirstLast{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter three digit number:");
  int n = sc.nextInt();
  
  int first = n/100;
  int last = n%10;
  int sum = first + last;

 System.out.print("Sum of first and last digit=" +sum);



 }

}