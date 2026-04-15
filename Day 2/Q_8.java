import java.util.Scanner;

public class Q_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);

        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:

                if (Character.isLetter(ch)) {
                    System.out.println(ch + " is a consonant.");
                } else {
                    System.out.println("Invalid input. Please enter an alphabet.");
                }
        }

        sc.close();
    }
}
