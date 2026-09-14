import java.util.Scanner;
public class Spy{
 public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter a number:");
 int n = sc.nextInt();
 
 int first = n/1000;
 int second =(n/100)%10;
 int third = (n/10)%10;
 int last = n%10;

 int sum = first + second + third + last;
 int product = first * second * third * last;

 if(sum == product)
   System.out.print("Number is spy");
else
   System.out.print("Number is not spy");
 }
}