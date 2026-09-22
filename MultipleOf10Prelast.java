import java.util.Scanner;
public class MultipleOf10Prelast{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter the number:");
 int num = sc.nextInt();
 
 int lastdigit = num%10;
 if(lastdigit < 5){
    int previous = num - lastdigit;
    System.out.println("Previous multiple =" + previous);
} else {
  int next = num + (10 - lastdigit);
  System.out.println("Next multiple=" + next);



}
}
}