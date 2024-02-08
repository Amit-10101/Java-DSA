import java.util.Scanner;

public class CheckingPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No.: ");
        int n = sc.nextInt();
        boolean isPrime = true;

        if (n == 2) {
            isPrime = true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }

        sc.close();
    }
}
