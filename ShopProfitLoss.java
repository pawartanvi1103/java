import java.util.Scanner;
public class ShopProfitLoss{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);

 System.out.println("ENter cost price :");
 int cp = sc.nextInt();

 System.out.println("ENter selling price :");
 int sp = sc.nextInt();

 int quantity = 100;

if(sp > cp){
   int profit = sp - cp;
   int totalProfit  = profit * quantity;
   System.out.println("Profit per unit =" + profit);
   System.out.println("Total profit on 100 item =" + totalProfit);
}
 else if (sp < cp) {
 int loss = cp - sp;
            int totalLoss = loss * quantity;

            System.out.println("Loss per unit = " + loss);
            System.out.println("Total loss on 100 items = " + totalLoss);
}
else {
   System.out.println("No profit no loss");
}

}
}