import java.util.Scanner;
public class EquiIsoScalene{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter three sides:");

 int a = sc.nextInt();
 int b = sc.nextInt();
 int c= sc.nextInt();

 if(a==b && b==c){
   System.out.print("Equilateral");
}else if(a==b || b==c || a==c){
    System.out.print("Isoscale");
}else{
    System.out.print("Scalene");
}

}
}