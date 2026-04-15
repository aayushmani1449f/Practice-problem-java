import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int reversed = 0;

        for (int temp = n; temp != 0; temp /= 10) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
        }

        if (n == reversed) {
            System.out.println(n + " is a palindrome number.");
        } else {
            System.out.println(n + " is not a palindrome number.");
        }

        sc.close();
    }
}
