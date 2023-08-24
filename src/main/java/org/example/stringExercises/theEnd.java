package org.example.stringExercises;

public class theEnd {
    static String str = "razvan";
    static boolean front;

    public static String main(String [] args) {
        {
            if (front)
                return str.substring(0, 1);
            else
                return str.substring(str.length() - 1);
        }
    }
}
