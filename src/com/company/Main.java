package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        double[] array1 = {8, 9, -5.15, -6.56, -8.17, -5, 3.3, 2.1, -1.5, 1, 4, 10.10, 13, 2, 3};
        double result = 0;
        double count = 0;
        int count1=0;
        for (double d : array1) {
            if (d > 0 && count1>0) {
                result += d;
                count++;
            }
            else if (d<0){
                count1++;
            }
        }



        System.out.println("Сренднее арифметическое " + result / count);
        swap();
    }

    //дз на сообразительность
    public static void swap() {

        int[] arrayI = {10, 2, 10, 3, 1, 2, 5};
        Arrays.sort(arrayI);
        System.out.println(Arrays.toString(arrayI));

    }
}





