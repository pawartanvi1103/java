import java.util.Scanner;
public class findFirstLast{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter three digit number:");
   int n = sc.nextInt();
   
   int first = n/100;
   int last = n%10;
   
   System.out.print("First= " +first);
   System.out.print("Last=" +last);

 }
}