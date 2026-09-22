import java.util.Scanner;
public class MonkeyBananaPeanut{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 
 int n = sc.nextInt();
 int k = sc.nextInt();
 int j = sc.nextInt();
 int m = sc.nextInt();
 int p = sc.nextInt();

 int monkeyEatingBananas = m/k;
 int monkeyEatingPeanuts = m/j;
 
 int totalmonkeyComeDown = monkeyEatingBananas + monkeyEatingPeanuts;

 int remaingmonkey = n - totalmonkeyComeDown;

 System.out.println("Number of monkey left on the tree =" + remaingmonkey);
}
}