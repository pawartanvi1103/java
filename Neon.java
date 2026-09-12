import java.util.Scanner;

class Neon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n * n;
        int temp = square;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        if (sum == n) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not a Neon Number");
        }
    }
}