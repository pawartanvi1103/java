import java.util.Scanner;
public class CREDAccess{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Rad the credit score :");
 int x = sc.nextInt();
 if(x >= 750)
   System.out.println("Yes");
 else
   System.out.println("No");
}
}