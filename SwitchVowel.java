import java.util.Scanner;
public class SwitchVowel{
 public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter an character :");
 char ch = sc.next().charAt(0);

 switch(ch){

  case 'a':
  case 'e':
  case 'i':
  case 'o':
  case 'u':
  case 'A':
  case 'E':
  case 'I':
  case 'O':
  case 'U':
    System.out.println("Vowel");
    break;

default :
   if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
   System.out.println("Consonent");
   else
     System.out.println("Not a letter");
}
}
}