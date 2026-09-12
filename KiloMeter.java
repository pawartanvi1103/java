import java.util.Scanner;
public class KiloMeter{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter length of Centimeter ");
 double cm = sc.nextDouble();
 
 double meter = cm/100;
 double kilometer=cm/100000;
 
 System.out.println("Meter=" + meter);
 System.out.println("Kilometer=" + kilometer);

}
}