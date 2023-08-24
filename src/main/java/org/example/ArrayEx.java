package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = getIntegers(size);
        System.out.println("Entered integers:");
        printArray(array);
    }

    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;


    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

//    public static int[] sortIntegers(int[] array) {
//        System.out.println(Arrays.toString(array));
//        int[] sortedArray = Arrays.copyOf(array, array.length);
//        boolean flag = true;
//        int temp;
//        while (flag) {
//            flag = false;
//            for (int i = 0; i < sortedArray.length - 1; i++) {
//                if (sortedArray[i] < sortedArray[i + 1]) {
//                    temp = sortedArray[i];
//                    sortedArray[i] = sortedArray [i + 1];
//                    sortedArray[i + 1] = temp;
//                    flag = true;
//                }
//
//            }
//        }
//
//
//
//        return sortedArray;
//
//    }
}
