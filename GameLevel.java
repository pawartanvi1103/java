import java.util.Scanner;

class GameLevel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Player score: ");
        int score = sc.nextInt();

        if (score > 1000)
            System.out.println("High level");
        else if (score >= 500)
            System.out.println("Medium level");
        else
            System.out.println("Low level");
    }
}