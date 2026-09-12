import java.util.Scanner;
public class CelFah{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enetr Celcius  temperature:");
 double cel = sc.nextDouble();
 double fah=(cel*9/5)+32;
 System.out.print("Fahrenheit=" +fah);
}
}