import java.util.Scanner;
public class TriangleValid{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enetr three sides of triangle:");
 int a = sc.nextInt();
 int b= sc.nextInt();
 int c =sc.nextInt();
 if(a+b>c && b+c>a && c+a>b){
  System.out.print("Valid");
 }else{
  System.out.print("Not valid");
}
}
}