import java.util.Scanner;
public class EligibilityCheck{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter percentage:");
 int percentage = sc.nextInt();

 System.out.println("Enetr income:");
 int income = sc.nextInt();
 
  if (percentage >= 60 && income <= 300000) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }





}


}