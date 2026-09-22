import java.util.Scanner;

class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three subject marks : ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        if (m1 > 35 && m2 > 35 && m3 > 35)
            System.out.println("Result is Pass");
        else
            System.out.println("Result is Fail");
    }
}