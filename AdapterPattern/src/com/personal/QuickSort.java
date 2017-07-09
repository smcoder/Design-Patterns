package com.personal;

/**
 * Created by mac on 09/07/2017.
 */
public class QuickSort {
    public int[] quickSort(int array[]) {
        sort(array, 0, array.length - 1);
        return array;
    }

    public void sort(int array[], int low, int high) {
        int q = 0;
        if (low < high) {
            q = partition(array, low , high);
            sort(array, low, q - 1);
            sort(array, q + 1, high);
        }
    }

    public int partition(int[] a, int low, int high) {
        int last = a[high];
        int first = low - 1;
        for (int i = low; i <= high - 1; i++) {
            if (a[i] <= last) {
                first++;
                swap(a, first, i);
            }
        }
        swap(a, first + 1, high);
        return first + 1;
    }

    public void swap(int[]a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
