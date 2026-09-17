import java.util.Scanner;
public class SalaryCalculator{
 public static void main(String []  args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter basic salaray:");
  double basic = sc.nextDouble();
  
 double hra = basic*20/100;
 double da = basic*10/100;
 double pf = basic*5/100;
 double net= basic;

net += hra;
net +=da;
net -=pf;

System.out.println("Net Salary="  +net);





}
}