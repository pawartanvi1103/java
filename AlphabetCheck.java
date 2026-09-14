import java.util.Scanner;
public class AlphabetCheck {
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter character");
 char ch = sc.next().charAt(0);

 if((ch >= 'A' && ch <= 'z') || (ch >= 'a' && ch <= 'z')){
  System.out.print("Alphabet");
}else{

  System.out.print("Not alphabet");
}
}
}