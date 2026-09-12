import java.util.Scanner;
public class Triangle{
public static void main(String args[]){
 Scanner sc = new Scanner(System.in);

 System.out.println("Enter first angle");
 int angle1 = sc.nextInt();
 
  System.out.println("Enter second angle");
 int angle2 = sc.nextInt();
 
 int angle3=180-angle1-angle2;

 System.out.print("Third angle="+angle3);

}
}