import java.util.Scanner;

class AbsoluteDifferenceCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int difference = Math.abs(a - b);

        if (difference > 10) {
            System.out.println("Absolute difference is greater than 10");
        } else {
            System.out.println("Absolute difference is not greater than 10");
        }
    }
}