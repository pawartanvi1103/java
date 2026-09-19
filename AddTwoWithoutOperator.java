import java.util.Scanner;
public class AddTwoWithoutOperator{
 public static void main(String[] args){
 int a = 37;
 int b= 25;
 while(b != 0){
 int carry = a & b;
 a = a^b;
 b = carry<<1;
}
 System.out.print("Sum=" +a);
}
}