import java.util.Scanner;
public class dayIntoYearsMonth{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
   System.out.print("Enter number of days:");
   int days = sc.nextInt();
  
  int years = days/365;
  int remainingDays= days%365;

 int months = remainingDays/30;
 remainingDays = remainingDays%30;

int weeks = remainingDays/7;
 int remaining = remainingDays%7;


 System.out.println("Years = " + years);
 System.out.println("Months = " + months);
 System.out.println("Weeks = " + weeks);
 System.out.println("Remaining days = " + remaining);




 }
}