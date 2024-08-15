package de.ricardo;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Java is cool!");

        int a = 10;
        int b = 5;
        int sum2 = a + b;

        System.out.println(sum2);

        double x = 12;
        double y = 15;


        double sum = x + y; // Addition
        double difference = x - y; // Subtraktion
        double product = x * y; // Multiplikation
        double quotient = x / y; // Division

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);

        boolean isEqual = x == y; // Gleichheit prüfen
        boolean isGreater = x > y; // Größer als prüfen
        boolean logicalAnd = x > 0 && y > 0; // Logisches UND
        boolean logicalOr = x > 0 || y > 0; // Logisches ODER
        boolean logicalNot = !(x > y); // Logisches NICHT

        System.out.println(isEqual);
        System.out.println(isGreater);
        System.out.println(logicalAnd);
        System.out.println(logicalOr);
        System.out.println(logicalNot);

    }
}
