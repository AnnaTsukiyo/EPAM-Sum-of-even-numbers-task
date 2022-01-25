package com.epam.rd.autotasks.arrays;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int[] vals = new int[]{-2, 10, 0, 5};
        int result = SumOfEvenNumbers.sum(vals);
        System.out.println(result == 8); // true
    }

    public static int sum(int[] array) {
        int evenSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else if (array == null || array.length == 0) {
                evenSum = 0;
            }
        }
        return evenSum;
    }
}