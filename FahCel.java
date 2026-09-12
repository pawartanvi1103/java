import java.util.Scanner;
public class FahCel{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enetr Fahrenheit temperature:");
 double fah = sc.nextDouble();
 double cel=(fah - 32) * 5 / 9;
 System.out.print("Celcius=" +cel);
}
}