import java.util.Scanner;
public class LargeIntegerUsingTernary{
 public static void main(String[] args){
  int a = 45;
 int b = 78;
 int c = 63;

 int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
 
 System.out.println("Maximum = " + max);
}
}