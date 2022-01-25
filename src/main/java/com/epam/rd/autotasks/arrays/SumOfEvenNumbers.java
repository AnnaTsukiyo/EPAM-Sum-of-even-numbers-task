package com.epam.rd.autotasks.arrays;

public class SumOfEvenNumbers {
    public static void main(String[] args) {

        int[] arrayOfNumbers = new int[]{-2, 10, 0, 5};
        int result = SumOfEvenNumbers.sum(arrayOfNumbers);
        System.out.println(result == 8); // true
    }

    public static int sum(int[] array) {
        if (Arrays.stream(array).allMatch(v -> Objects.isNull(v))) {
            int res = 0;
            return res;
        } else return Arrays.stream(array).filter(f -> f % 2 == 0).sum();
    }
}
