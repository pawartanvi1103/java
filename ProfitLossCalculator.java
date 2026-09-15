import java.util.Scanner;
public class ProfitLossCalculator{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  
 System.out.print("Enetr cost price:");
 double costPrice = sc.nextDouble();
 
 System.out.print("Enetr selling price:");
 double sellingPrice = sc.nextDouble();

if (sellingPrice > costPrice){
 System.out.println("profit");
}else if( sellingPrice < costPrice){
  System.out.println("Loss");
}else{
  System.out.println("No profit no loss");
}

}
}