package com.epam.rd.autotasks.arrays;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        int[] arrayOfNumbers = new int[]{-2, 10, 0, 5};
        sum(arrayOfNumbers);
    }

    private static int sum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int sumEvent = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sumEvent = sumEvent + array[i];
            }
        }
        return sumEvent;
    }
}
