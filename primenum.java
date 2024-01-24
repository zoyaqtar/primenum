import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int a = s.nextInt(), b = s.nextInt();
        System.out.println("Prime numbers between " + a + " and " + b + ":");
        generatePrimeNumbers(a, b);
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) if (num % i == 0) return false;
        return true;
    }

    private static void generatePrimeNumbers(int a, int b) {
        for (int i = a; i <= b; i++) if (isPrime(i)) System.out.print(i + " ");
    }
}
