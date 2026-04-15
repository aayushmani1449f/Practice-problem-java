import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to sum : ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("The sum is : " + sum);
    }
}
