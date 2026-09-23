import java.util.Scanner;
public class SwitchMax{
  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  
 System.out.println("Enter the  two number:");
 int a = sc.nextInt();
 int b = sc.nextInt();

int result;
 if(a > b)
    result = 1;
else if(b > a)
     result = 2;
else 
    result = 0;

switch(result){
  case 1:
     System.out.println( a +" is max");
     break;
  case 2:
      System.out.println(b + "is max");
       break;
  case 0:
      System.out.println("Both numners are equal");
      break;

}
}
}