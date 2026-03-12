import java.util.Scanner;

public class PasswordPrompt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String secretPassword = "abc@123";
        String enteredPassword;

        do {
            System.out.print("Enter the password: ");
            enteredPassword = sc.nextLine();

            if (!enteredPassword.equals(secretPassword)) {
                System.out.println("Wrong password. Try again.");
            }

        } while (!enteredPassword.equals(secretPassword));

        System.out.println("Access Granted");

        sc.close();
    }
}