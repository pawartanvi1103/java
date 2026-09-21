import java.util.Scanner;
public class QuadraticEquation{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 
 double a = sc.nextDouble();
 double b = sc.nextDouble();
 double c = sc.nextDouble();

 double d = b*b-4*a*c;

 if(d > 0){
  Double r1 = (-b + Math.sqrt(d)) / (2 * a);
  Double r2 = (-b + Math.sqrt(d)) / (2 * a);

 System.out.println("Root 1=" + r1);
 System.out.println("Root 2=" + r2);

} else if(d == 0){
  
 double r = -b/(2 * a);
 System.out.println("Root=" +r);

 } else {
 
System.out.println("No real roots");



}
}
}