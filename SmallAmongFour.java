import java.util.Scanner;
public class SmallAmongFour{
 public static void main(String[] args){
 
 int a= 45;
 int b= 18;
 int c = 72;
 int d = 31;

int minAB=(a < b)? a : b;
int minCD = (c < d)? c : d;
int min = (minAB < minCD)? minAB : minCD;

System.out.print("Minimum=" +min);
}
}