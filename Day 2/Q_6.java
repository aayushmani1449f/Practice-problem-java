import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int reversed = 0;

        for (; n != 0; n /= 10) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("The reversed number is: " + reversed);
        sc.close();
    }
}
