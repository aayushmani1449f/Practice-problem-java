import java.util.*;

public class Q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number from 0 to 1000 : ");
        int number = sc.nextInt();

        if (number == 1) {
            System.out.println("unit");
        } else if (number == 10) {
            System.out.println("ten");
        } else if (number == 100) {
            System.out.println("hundred");
        } else if (number == 1000) {
            System.out.println("thousand");
        } else {
            System.out.println("Invalid input. Please enter 1, 10, 100, or 1000.");
        }

    }
}