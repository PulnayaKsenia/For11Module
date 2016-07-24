package ua.goit.for11module.minMax;

import java.util.Arrays;

public class ArrayUtils {
    public static MinMaxPair getMinMax(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }

        return new MinMaxPair(min, max);
    }

    public static int[] sort(int[] array) {
        int[] sort = Arrays.copyOf(array, array.length);

        for (int i = sort.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (sort[j] > sort[j + 1]) {
                    int k = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = k;
                }
            }
        }

        return sort;
    }
}






