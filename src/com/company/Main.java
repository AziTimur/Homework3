package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        double[] array = {-5.6, -7.1, -5.15, -6.56, -8.17, -5, 3.3, 2.1, 1.5, 1, 4, 10.10, 13, 2, 3};
        double result = 0;
        double count = 0;
        for (double d : array) {
            if (d > 0) {
                result += d;
                count++;
            }
        }
        System.out.println("Сренднее арифметическое " + result / count);
    }
    //дз на сообразительность

    private void swap(int[] array, int i, int i1) {
        int[] arrayI = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        for (
                int j = 1;
                i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i, i - 1);
            }
        }
        System.out.println(Arrays.toString(array));
    }
}



