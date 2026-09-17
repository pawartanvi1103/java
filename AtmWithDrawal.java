import java.util.Scanner;

class AtmWithDrawal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter withdrawal amount: ");
        int x = sc.nextInt();

        System.out.print("Enter account balance: ");
        double y = sc.nextDouble();

        if (x % 5 == 0 && x + 0.50 <= y) {
            y = y - x - 0.50;
        }

        System.out.printf("%.2f", y);
    }
}