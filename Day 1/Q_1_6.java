class Q_1_6 {

    static int count;

    static {
        count = 100;
        System.out.println("Static block executed. Count initialized to " + count);
    }

    static void show() {
        System.out.println("Static method called. Count = " + count);
    }

    public static void main(String[] args) {

        System.out.println("Main method started");

        Q_1_6.show();

        Q_1_6 obj1 = new Q_1_6();
        Q_1_6 obj2 = new Q_1_6();

        obj1.count++;
        System.out.println("After increment: " + obj2.count);
    }
}