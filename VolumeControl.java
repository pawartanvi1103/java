import java.util.Scanner;
public class VolumeControl{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 int T = sc.nextInt();
 while(T-->0){
 int x= sc.nextInt();
 int y = sc.nextInt();
 int presses = Math.abs(x-y);
 System.out.println(presses);
}
}
}