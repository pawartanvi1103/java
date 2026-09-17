import java.util.Scanner;
public class CabServiceComparison{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 int x = sc.nextInt();
 int y = sc.nextInt();
 
 if(x < y){
  System.out.println("First");
}else if(x > y){
   System.out.println("Second");
}else{
   System.out.println("Any");
}

}
}