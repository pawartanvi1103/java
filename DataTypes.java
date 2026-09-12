import java.util.Scanner;

class DataTypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter byte value: ");
        byte b = sc.nextByte();

        System.out.print("Enter short value: ");
        short s = sc.nextShort();

        System.out.print("Enter int value: ");
        int i = sc.nextInt();

        System.out.print("Enter long value: ");
        long l = sc.nextLong();

        System.out.print("Enter float value: ");
        float f = sc.nextFloat();

        System.out.print("Enter double value: ");
        double d = sc.nextDouble();

        System.out.print("Enter character: ");
        char c = sc.next().charAt(0);

        System.out.print("Enter boolean value: ");
        boolean bool = sc.nextBoolean();

        System.out.println("\n--- Output ---");
        System.out.println("Byte = " + b);
        System.out.println("Short = " + s);
        System.out.println("Int = " + i);
        System.out.println("Long = " + l);
        System.out.println("Float = " + f);
        System.out.println("Double = " + d);
        System.out.println("Character = " + c);
        System.out.println("Boolean = " + bool);
    }
}