import java.util.Scanner;
public class CourseEnrollment{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the test cases :");

int t = sc.nextInt();
while(t --> 0){
  int n = sc.nextInt();
  int m = sc.nextInt();
  int k = sc.nextInt();
  
 int total = n + k;
 if(total <= m)
    System.out.println("Yes");
 else
    System.out.println("No");


}
}
}