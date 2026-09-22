import java.util.Scanner;
public class PrevNextMultiple{
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n >= 100 && n <= 999) {

            int r = n % 100;

            System.out.println("Previous multiple : " + (n - r));
            System.out.println("Next multiple : " + (n + (100 - r)));

        } else {

            System.out.println("Invalid Input");
        }
    }
}