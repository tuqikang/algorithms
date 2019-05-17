package sort;

import utils.RandomIntArray;

/**
 * ___________ ________     ____  __.
 * \__    ___/ \_____  \   |    |/ _|
 * |    |     /  / \  \  |      <
 * |    |    /   \_/.  \ |    |  \
 * |____|    \_____\ \_/ |____|__ \
 *
 * @Author: tuqikang
 * @Date: 2019-05-17 19:32
 */
public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int j;
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            for (j = i; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = RandomIntArray.getArray(0,1000,300);
        RandomIntArray.display(arr);
        InsertionSort.insertionSort(arr);
        RandomIntArray.display(arr);
    }
}
