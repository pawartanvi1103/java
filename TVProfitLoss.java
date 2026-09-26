import java.util.Scanner;
public class TVProfitLoss{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter the cost price :");
 double cp = sc.nextDouble();

 System.out.println("Enter the selling price :");
 double totalSP = sc.nextDouble();

 double netSP = totalSP *100/115;

if(netSP > cp){
   double profit = netSP - cp;
   System.out.println("Profit");
}
else if(netSP < cp){
    double loss = cp - netSP;
    System.out.println("Loss");
}
else {
   System.out.println("No profit no loss");
}
}
}