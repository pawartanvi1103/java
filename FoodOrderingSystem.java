import java.util.Scanner;

class FoodOrderingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Burger - ₹100");
                break;

            case 2:
                System.out.println("Pizza - ₹250");
                break;

            case 3:
                System.out.println("Pasta - ₹180");
                break;

            case 4:
                System.out.println("Sandwich - ₹80");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}