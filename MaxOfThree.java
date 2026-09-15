import java.util.Scanner;
public class MaxOfThree{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enetr three numbers:");
 int a = sc.nextInt();
 int b = sc.nextInt();
 int c = sc.nextInt();

int max;
if(a>b && b>c){
 max=a;
}else if(b > c){
 max = b;
}else{
  max = c;
}
 System.out.println("Maximum=" +max);
}
}