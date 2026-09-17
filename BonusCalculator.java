import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter performance rating: ");
        int rating = scanner.nextInt();
        double bonus;

        
        if (rating > 8) {
            bonus = 0.15;
        } else if (rating >= 5 && rating <= 8) {
            bonus = 0.10;
        } else {
            bonus = 0.0;
        }

        
        System.out.printf("%.0f%% Bonus\n", bonus * 100);
        scanner.close();
    }
}
