package org.example;

public class CNPValid {
    public static void main(String[] args) {
        String cnp = "2990219469000"; // Replace this with the CNP you want to validate
        boolean isValid = validateCNP(cnp);

        if (isValid) {
            System.out.println("CNP-ul este valid.");
        } else {
            System.out.println("CNP-ul este incorect.");
        }
    }

    public static boolean validateCNP(String cnp) {
        if (cnp.length() != 13) {
            return false; // CNP must have exactly 13 digits
        }

        String constant = "279146358279";
        int sum = 0;

        for (int i = 0; i < 12; i++) {
            int digitCNP = Character.getNumericValue(cnp.charAt(i));
            int digitConstant = Character.getNumericValue(constant.charAt(i));
            sum += digitCNP * digitConstant;
        }

        int remainder = sum % 11;
        int controlDigit = Character.getNumericValue(cnp.charAt(12));

        if (remainder < 10 && remainder == controlDigit) {
            return true;
        } else if (remainder == 10 && controlDigit == 1) {
            return true;
        } else {
            return false;
        }
    }
}