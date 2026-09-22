import java.util.Scanner;
public class BonusCalculator{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 int years = sc.nextInt();
 double salary = sc.nextDouble();

 if(years > 5){
   double bonus = salary * 0.05;
   System.out.println("Bonus =" +bonus);

}else{
 System.out.println("No bouns");
}
}
}