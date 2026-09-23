import java.util.Scanner;
public class Department{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Enetr your id :");
 int id = sc.nextInt();

 switch(id){
     case 11:
     case 12:
     case 13:
     case 14:
     case 15:
       System.out.println("Sotware department");
       break;
  
     case 16:
     case 17:
     case 18:
     case 19:
     case 20:
       System.out.println("Developer Department");
       break;

     case 21:
     case 22:
     case 23:
        System.out.println("Managment Department");
        break;
}
}
}