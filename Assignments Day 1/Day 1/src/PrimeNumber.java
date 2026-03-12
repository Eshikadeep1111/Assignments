import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;  // stop loop if divisor found
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }

        sc.close();
    }
}