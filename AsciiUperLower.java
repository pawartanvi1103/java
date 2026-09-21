import java.util.Scanner;
public class AsciiUperLower{
 public static void main(String args[]){
 Scanner xyz = new Scanner(System.in);
 char ch;
 System.out.println("Enter number from keyboard:");
 ch = xyz.nextLine().charAt(0);

 System.out.printf("Before conversion %c\n", ch);
 if(ch >= 65 && ch<= 90)
{
 ch = (char)((int) ch + 32);
} else {
 ch = (char)((int) ch - 32);
}
 System.out.printf("After conversion %c\n", ch);

}
}