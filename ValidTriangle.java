import java.util.Scanner;
public class ValidTriangle{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter three angle:");
  int angle1 = sc.nextInt();
  int angle2 = sc.nextInt();
  int angle3 = sc.nextInt();

  int sum = angle1 + angle2 + angle3;
  if(sum == 180){
    System.out.println("Valid angle");
}else{
    System.out.println("Not valid");
}


 }
}