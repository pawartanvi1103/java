import java.util.Scanner;
public class CurrencyNotes{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 int amount = sc.nextInt();
 int count=0;
 int[] notes = {500,200,100,50,20,10};
 for(int note:notes){
 count = count + amount/note;
 amount = amount%note;
}
 System.out.print("total notes=" +count);
}
}