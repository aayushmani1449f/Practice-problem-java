import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaFactorialUsingRecursion {
    public static void main(String args[]) throws NumberFormatException, IOException {
        System.out.println("Enter the number: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        int result = fact(a);
        System.out.println("Factorial of the number is: " + result);

    }

    static int fact(int b) {
        if (b <= 1)

            return 1;
        else

            return b * fact(b - 1);
    }
}