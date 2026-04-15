import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers (a, b, c): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int op1 = a + b * c;
        int op2 = c + a / b;
        int op3 = a % b + c;
        int op4 = a * b + c;

        System.out.println("i) a + b * c = " + op1);
        System.out.println("ii) c + a / b = " + op2);
        System.out.println("iii) a % b + c = " + op3);
        System.out.println("iv) a * b + c = " + op4);

        int max = Math.max(Math.max(op1, op2), Math.max(op3, op4));
        int min = Math.min(Math.min(op1, op2), Math.min(op3, op4));

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        sc.close();
    }
}