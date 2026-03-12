//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number:");
        int n = sc.nextInt();
        int a = 0, b =1;
        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {

            System.out.println(a + " ");
            int next = a+b;
            a = b;
            b = next;
        }
        sc.close();
    }
}