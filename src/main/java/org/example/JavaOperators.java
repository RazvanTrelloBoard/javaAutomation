package org.example;

public class JavaOperators {
    public static void main(String[] args) {

        int x = 3;
//        int y = x++;
        int y = x;
        x++;
        System.out.printf("Using x++, x is %s and y is %s.%n", x, y);
        // Using x++, x is 4 and y is 3.

        x = 3;
//        y = ++x;
        x++;
        y = x;
        System.out.printf("Using ++x, x is %s and y is %s.%n", x, y);
        // Using ++x, x is 4 and y is 4.

        System.out.println("Don't do this!");
        x = 3;
//        y = ++x - x++;
        x++;
        int z = x;
        y = z - x;  // or just y = 0;
        x++;
        System.out.printf("++x - x++ gives: x is %s and y is %s.%n", x, y);
        // ++x - x++ gives: x is 5 and y is 0

        x = 3;
//        y = x++ - ++x;
        z = x;
        x += 2;
        y = z - x;  // or just y = -2;
        System.out.printf("x++ - ++x gives: x is %s and y is %s.%n", x, y);
        // x++ - ++x gives: x is 5 and y is -2
    }
}
