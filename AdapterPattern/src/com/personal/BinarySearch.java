package com.personal;

/**
 * Created by mac on 09/07/2017.
 */
public class BinarySearch {
    public int binarySearch(int array[], int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midValue = array[mid];
            if (midValue < key) {
                low = mid + 1;
            } else if (midValue > key) {
                high = mid - 1;
            } else {
                return 1;
            }
        }
        return -1;
    }
}
