import java.util.Scanner;
public class EzioManipulation{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("ENter the test cases :");
 int T = sc.nextInt();
 while(T --> 0){
    int X = sc.nextInt();
    int Y = sc.nextInt();

if(X >= Y)
  System.out.println("Yes");
else
  System.out.println("No");
}
}
}