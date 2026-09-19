import java.util.Scanner;
public class SwapWithoutTernary{
 public static void main(String[] args){
  int a= 10;
  int b= 20;
  int c= 30;
 
 a = a+b+c;
 b=a-b-c;
 c=a-b-c;
 a=a-b-c;

 System.out.println("A =" + a);
 System.out.println("B =" + b);
 System.out.println("C =" + c);


}
}