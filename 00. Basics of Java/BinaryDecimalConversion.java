import java.util.Scanner;

public class BinaryDecimalConversion {
    public static int BinaryToDecimal(int n) {
        int result = 0;

        int i = 0;
        while (n != 0) {
            result = result + ((n % 10) * (int) Math.pow(2, i++));
            n /= 10;
        }

        return result;
    }

    public static int DecimalToBinary(int n) {
        int result = 0;

        int i = 0;
        while (n != 0) {
            result = result + ((n % 2) * (int) Math.pow(10, i++));
            n /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choices:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");

        System.out.print("Enter Function No.: ");
        int choice = sc.nextInt();
        int n;

        System.out.println();
        switch (choice) {
            case 1:
                System.out.print("Enter Binary No.: ");
                n = sc.nextInt();
                System.out.println("Decimal Result: " + BinaryToDecimal(n));
                break;

            case 2:
                System.out.print("Enter Decimal No.: ");
                n = sc.nextInt();
                System.out.println("Binary Result: " + DecimalToBinary(n)); 
                break;
        
            default:
                break;
        }

        sc.close();
    }
}
