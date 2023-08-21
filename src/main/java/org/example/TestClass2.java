package org.example;

public class TestClass2 {
    int counter = 0;
    public boolean tester() {
        if (counter < 20) {
            counter++;
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) throws Exception {
        TestClass2 tc = new TestClass2();
        while (tc.tester()) {
            System.out.println("running...");
        }
    }
}