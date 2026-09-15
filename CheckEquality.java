import java.util.Scanner;
public class CheckEquality{
 public static void main(String [] args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enetr two numbers:");
 int a = sc.nextInt();
 int b = sc.nextInt();

 if (a==b){
 System.out.println("Equal");
}else{
 System.out.println("Not equal");
}
}
}