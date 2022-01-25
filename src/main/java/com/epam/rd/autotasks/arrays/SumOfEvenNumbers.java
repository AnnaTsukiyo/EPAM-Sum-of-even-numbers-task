package com.epam.rd.autotasks.arrays;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        int[] arrayOfNumbers = new int[]{-2, 10, 0, 5};
        int result = SumOfEvenNumbers.sum(arrayOfNumbers);
        System.out.println(result == 8); // true
    }

    private static int sum(int[] array) {
        int sumEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length == 0 || Objects.isNull(array[i])) {
                return 0;
            }

            if (array[i] % 2 == 0) {
                sumEven += array[i];
            }
        }
        return sumEven;
    }
}
