import java.util.Scanner;
public class Circle{
 public static void main(String arg[]){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter radius");
 double radius=sc.nextDouble();

 double diameter= 2*radius;
 double circumference=2*3.14*radius;
 double area=3.14*radius*radius;
 System.out.println("Diameter="+diameter);
 System.out.println("Circumference="+circumference);
 System.out.println("Area="+area);
}
}