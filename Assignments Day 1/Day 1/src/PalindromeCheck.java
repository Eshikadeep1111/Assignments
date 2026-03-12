import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num= sc.nextInt();
        int original = num;
        int rev = 0;

        while(num != 0){
            int digit = num % 10;
            rev = rev *10 + digit;
            num = num /10;
        }
        System.out.println("Reversed number:" +rev);
        if(original == rev){
            System.out.println("It is a palindrome");}
        else {
            System.out.println("It is not a palindrome");
        }
            sc.close();
    }
}
