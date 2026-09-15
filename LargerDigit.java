import java.util.Scanner;
public class LargerDigit{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enetr a three digit numbers:");
 int n = sc.nextInt();
 
 int first = n/100;
 int last = n%10;
 int larger=(first > last) ? first : last;
System.out.println("Larger digit = " + larger);

}
}