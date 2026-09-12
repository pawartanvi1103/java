import java.util.Scanner;
public class ThirdVariableSwap{
 public static void main(String args[]){
  Scanner sc = new Scanner (System.in);
  
 System.out.print("enter two values:");
 int a = sc.nextInt();
 int b = sc.nextInt();

 int temp=a;
 a = b;
 b= temp;
 System.out.print("After Swapping");
 System.out.print("a="+a);
 System.out.print("a="+b);

 }
}