import java.util.Scanner;

class MiddleValueFinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three distinct numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int middle = (a > b)
                ? ((b > c) ? b : ((a > c) ? c : a))
                : ((a > c) ? a : ((b > c) ? c : b));

        System.out.println("Middle = " + middle);
    }
}