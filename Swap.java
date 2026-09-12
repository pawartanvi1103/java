import java.util.*;
public class Swap{
public static void main(String x[]){
Scanner xyz = new Scanner(System.in);
System.out.print("Enter two values");
int a = xyz.nextInt();
int b= xyz.nextInt();
System.out.print("Before swapping\n");
System.out.printf("A=%d\tB=%d\n",a,b);
a=a+b;
b=a-b;
a=a-b;
System.out.print("After swapping\n");
System.out.printf("A=%d\tB=%d\n",a,b);

}
}