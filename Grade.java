import java.util.Scanner;

class Grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter if you have extra credit (1 for Yes, 0 for No): ");
        int extra = sc.nextInt();

        if (extra == 1)
            marks = marks + 5;

        if (marks >= 90)
            System.out.println("Your grade is A.");
        else if (marks >= 80)
            System.out.println("Your grade is B.");
        else if (marks >= 70)
            System.out.println("Your grade is C.");
        else if (marks >= 60)
            System.out.println("Your grade is D.");
        else
            System.out.println("Your grade is F.");
    }
}