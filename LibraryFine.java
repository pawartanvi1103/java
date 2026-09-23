import java.util.Scanner;
public class LibraryFine{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the days :");
 int days = sc.nextInt();
 double fine;
 
 if(days <= 5){
   fine = days * 2;
   System.out.println("Fine =" + fine);
   System.out.println("Membership active");
}

 else if(days <= 10){
    fine = days * 3;
    System.out.println("Fine=" +fine);
    System.out.println("Membership active");
}

 else if(days <= 30){
    fine = days * 5;
    System.out.println("Fine =" + fine);
    System.out.println("Membership active");
}
else {
    fine = 500;
    System.out.println("Fine =" + fine);
    System.out.println("Membership cancleed");
}
 
}
}