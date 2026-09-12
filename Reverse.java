import java.util.Scanner;
public class Reverse{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter three digit value:");
  int n = sc.nextInt();

 int first = n/100;
 int middle = (n/10)%10;
 int last = n%10;
 
int reverse = last*100 + middle*10 + first;
System.out.print("Reverse number=" +reverse);





 }
}
