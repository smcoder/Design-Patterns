package com.personal;

/**
 * Created by mac on 09/07/2017.
 */
public class OperationAdapter implements ScoreOperation {

    private QuickSort sortObj;
    private BinarySearch searchObj;

    public OperationAdapter() {
        sortObj = new QuickSort();
        searchObj = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return sortObj.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return searchObj.binarySearch(array, key);
    }
}
