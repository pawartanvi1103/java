import java.util.Scanner;
public class CabServiceComparison2{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the price of the first cab service :");
 int a = sc.nextInt();

 System.out.println("Enter the price of the second cab service :");
 int b = sc.nextInt();

 if(a < b){
    System.out.println("First");
}
else{
    System.out.println("Second");
}


}
}