import java.util.Scanner;
public class Disscount{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of item purchased :");
  int items = sc.nextInt();
  if (items > 10)
     System.out.println("Customer eligible for disscount");
 else 
     System.out.println("Customer will not eligible");
}
}