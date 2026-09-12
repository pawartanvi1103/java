import java.util.Scanner;
public class SecondIntoHrMin{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
   System.out.println("Enetr second:");
   int totalSeconds=sc.nextInt();
   
  int hours = totalSeconds/3600;
  
 int remainingSeconds = totalSeconds%3600;
 
 int minutes = remainingSeconds/60;

 int second = remainingSeconds%60;

  System.out.println("Hours="+hours);
    System.out.println("Minutes="+minutes);
  System.out.println("Second="+second);


 }
}
