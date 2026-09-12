import java.util.*;
public class PerStu{
public static void main(String x[]){
Scanner xyz=new Scanner(System.in);
System.out.println("Enter id name of student");
String name=xyz.nextLine();
int id=xyz.nextInt();
System.out.print("Enter marks of student");
int s1=xyz.nextInt();
int s2=xyz.nextInt();
int s3=xyz.nextInt();
int s4=xyz.nextInt();
int s5=xyz.nextInt();
int s6=xyz.nextInt();
int per=(s1+s2+s3+s4+s5+s6)/6;
String message=per>40?"pass":"fail";
System.out.print(message);

}
}