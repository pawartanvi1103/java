import java.util.Scanner;
public class MobilePlanBilling{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter minutes :");
  int minutes = sc.nextInt();
  double bill;
  
 if(minutes <= 100){
    bill = 199;  
  }
 else if(minutes <= 300){
    bill = 199 + (minutes - 100)*1;
}
 else if(minutes <= 500){
    bill = 199 + 200 * 1 + (minutes - 300)*1.5;
}
else {
  bill  = 199 + 200 * 1 + 200 * 1.5 + (minutes - 500)* 2;
}
System.out.println("Bill = " + bill);



}
}