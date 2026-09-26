import java.util.Scanner;

public class EmployeeSalaryRange {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("ENter the level (1-3):");
  int level = sc.nextInt();
  switch(level){
    case 1:
      System.out.println("Junior (20,000 - 30,000)");
       break;

   case 2:
      System.out.println("Mid (31,000 - 50,000)");
       break;

  case 3:
      System.out.println("Mid (51,000 - 80,000)");
       break;

  default:
      System.out.println("Invalid Level");
}
}
}