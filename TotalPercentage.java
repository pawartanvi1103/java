import java.util.Scanner;
public class TotalPercentage{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter five subject marks:");
 
 double m1 = sc.nextDouble();
 double m2 = sc.nextDouble();
 double m3 = sc.nextDouble();
 double m4 = sc.nextDouble();
 double m5 = sc.nextDouble();
 
 double total = m1+m2+m3+m4+m5;
 double percentage = total/5;
 
 System.out.println("Total marks=" +total);
 System.out.println("Percentage=" +percentage);
}
}