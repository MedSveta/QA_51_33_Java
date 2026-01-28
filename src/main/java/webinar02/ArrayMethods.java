package webinar02;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] arr1 = new int[7];
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("=================");

        int[] arr2 = {3, 8, 9, 6, 80};
        System.out.println(Arrays.toString(arr2));
        System.out.println("=================");
        int[] arr3 = new int[]{};
        System.out.println(arr3.length);
        System.out.println(Arrays.toString(arr3));
        System.out.println("=================");
        String[] name = {"Ira", "Misha", "Dima"};
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " ");
        }
        System.out.println();
        System.out.println("=================");
        for (int i = 0; i < name.length; ) {
            System.out.println(name[i++]);
        }
        System.out.println("=================");
        for (int i = name.length - 1; i >= 0; i--) {
            System.out.print(name[i] + " ");
        }
        System.out.println();
        System.out.println("=================");
        for (String s : name) {
            System.out.println(s);
        }
        System.out.println("=================");
        String[] str = {"day!", "good", "very", "a", null, "is", "Today"};
        System.out.println(returnTextReverse(str));
        System.out.println("=================");
        int[] degrees = {1, 7, -15, 30, 24, 0, -1};
        System.out.println(returnMiddleTemperature(degrees));
        System.out.println("=================");
        System.out.println(returnMinTemperature(degrees));
    }

    public static int returnMinTemperature(int[] degrees) {
        if (degrees == null || degrees.length == 0) {
            System.out.println("Array is null or empty!");
            return 9999999;
        }
        int min = degrees[0];
        for (int i = 1; i < degrees.length; i++) {
            if(min > degrees[i]){
                min = degrees[i];
            }
        }
        return min;
    }

    public static int returnMiddleTemperature(int[] degrees) {
        if (degrees == null || degrees.length == 0) {
            System.out.println("Array is null or empty!");
            return 9999999;
        }
        int sum = 0;
        for (int d : degrees) {
            sum += d;
        }
        return sum / degrees.length;
    }

    public static String returnTextReverse(String[] str) {
        if (str == null || str.length == 0) {
            return null;
        }
        String textReverse = "";
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i] != null)
                textReverse += str[i] + " ";
        }
        return textReverse;
    }


}
