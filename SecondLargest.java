import java.util.Scanner;
public class SecondLargest{
 public static void main(String[] args){
  
 int a = 85;
 int b= 42;
 int c= 67;
 
 int second=(a > b) ? ((b > c) ? b : ((a > c) ? c : a)) : ((a > c) ? a : ((b > c) ? c : b));
 System.out.println("Second Largest =" + second);
}
}