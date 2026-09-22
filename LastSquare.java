import java.util.Scanner;
public class LastSquare{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 
 int n = sc.nextInt();
 int last = n %10;
 if(last < 5){
   System.out.println(n * n);
}else {
   System.out.println(n);
}
}
}