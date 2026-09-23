import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter attendance percentage: ");
        int attendance = scanner.nextInt();
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        
        if (attendance >= 75 && marks >= 80) {
            System.out.println("Eligible for Scholarship");
        } else {
            System.out.println("Not Eligible for Scholarship");
        }
        scanner.close();
    }
}