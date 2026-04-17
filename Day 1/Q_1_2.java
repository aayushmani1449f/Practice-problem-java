public class Q_1_2 {

    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    public void displayDefaults() {
        System.out.println("Default values of primitive data types in Java:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: [" + c + "]");
        System.out.println("boolean: " + bool);
    }

    public static void main(String[] args) {
        Q_1_2 obj = new Q_1_2();
        obj.displayDefaults();
    }
}