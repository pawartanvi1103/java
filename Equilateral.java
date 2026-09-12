import java.util.Scanner;
public class Equilateral{
 public static void main(String args[]){
 Scanner sc = new Scanner (System.in);
 System.out.print("Enter the side of triangle :");
 double side= sc.nextDouble();
 double area= (Math.sqrt(3)/4)*side*side;
 System.out.print("Area of equilateral triangle=" + area);
}
}