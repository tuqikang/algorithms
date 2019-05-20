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
 * @Date: 2019-05-20 20:13
 * 冒泡排序
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    RandomIntArray.swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = RandomIntArray.getArray(0, 100000, 10000);
        RandomIntArray.display(arr);
        BubbleSort.bubbleSort(arr);
        RandomIntArray.display(arr);
    }
}
