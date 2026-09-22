import java.util.Scanner;

class CandyJar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = 10;
        int min = 5;
        int candies = 10;

        while (true) {

            System.out.print("Enter number of candies to order: ");
            int order = sc.nextInt();

            if (order <= 0 || order > candies) {
                System.out.println("INVALID INPUT");
                System.out.println("NUMBER OF CANDIES LEFT: " + candies);
                continue;
            }

            candies = candies - order;

            System.out.println("NUMBER OF CANDIES SOLD: " + order);

            if (candies <= min) {
                candies = max;
            }

            System.out.println("NUMBER OF CANDIES AVAILABLE: " + candies);
        }
    }
}