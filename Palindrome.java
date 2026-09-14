import java.util.Scanner;
public class Palindrome{
 public static void main(String [] args){
 Scanner sc = new Scanner (System.in);
 System.out.print("Enter a number:");
 int n = sc.nextInt();

 int first = n/100;
 int middle = (n/10)%10;
 int last = n%10;

 int reverse = last*100 + middle*10 + first;
 
 if(n == reverse)
     System.out.print("Number is Palindrome");
else
    System.out.print("Number is not Palindrome");
}
}