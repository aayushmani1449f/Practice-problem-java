public class Q_1_4 {
    public static void main(String[] args) {
        int sum = 0;
        int invalidCount = 0;

        for (int i = 0; i < args.length; i++) {
            try {
                sum = sum + Integer.parseInt(args[i]);
            } catch (Exception e) {
                invalidCount++;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Invalid: " + invalidCount);
    }
}
