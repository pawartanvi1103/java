import java.util.Scanner;
public class GameWinner{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enetr First player name :");
 String name1 = sc.nextLine();
 
 System.out.println("Enter first player score :");
 int score1 = sc.nextInt();
 sc.nextLine();
 
 System.out.println("Enetr second player name :");
 String name2 = sc.nextLine();
 
 System.out.println("Enter second player score :");
 int score2 = sc.nextInt();

 int result;
  
 if(score1 > score2)
    result = 1;
 else if(score2 > score1)
     result = 2;
 else
     result = 0;

 switch(result){

 case 1:
    System.out.println(name1 + "won the match by" +(score1 - score2) + "points.");
    break;

 case 2:
     System.out.println(name2 + "won the match by" +(score2 - score1) + "points.");
}
}
}