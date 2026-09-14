import java.util.Scanner;
public class MultipleofThreeFive{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enetr number:");
 int num = sc.nextInt();

 if(num%3 == 0 && num % 5 ==0){
   System.out.println("Multiple of both 3 and 5");

} else{
    System.out.println("Not a multiple of both 3 and 5");
 }
}
}