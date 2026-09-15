import java.util.Scanner;
public class CharacterTypeChecker{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter character:");
char ch = sc.next().charAt(0);

if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
 System.out.println("Character");
}else if(ch >= '0' && ch <='9'){

System.out.print("Number");

}else {
System.out.println("Special character");
}
}
}