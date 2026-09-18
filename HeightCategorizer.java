import java.util.Scanner;
public class HeightCategorizer{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter height:");
 double height= sc.nextDouble();

 if(height<150)
  System.out.print("person is daurf");
else if(height < 165)
  System.out.print("person is average height");
else if( height <= 195)
   System.out.print("The person is taller");
else
    System.out.print("Above given average");
}

}