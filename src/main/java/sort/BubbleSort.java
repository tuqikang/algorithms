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
 * 平均时间复杂度  最好情况  最坏情况  空间复杂度  排序方式    稳定性
 * O(n^2)       O(n)    O(n^2)    O(1)    In-place    true
 */
public class BubbleSort {

//    public static int[] bubbleSort(int[] arr) {
//        for (int i = arr.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    RandomIntArray.swap(arr, j, j + 1);
//                }
//            }
//        }
//        return arr;
//    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            boolean b = true;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    RandomIntArray.swap(arr, j, j + 1);
                    b = false;
                }
            }
            if (b) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] arr = RandomIntArray.getArraySorted(0, 100000, 100000);
        RandomIntArray.display(arr);
        BubbleSort.bubbleSort(arr);
        RandomIntArray.display(arr);
        long end = System.currentTimeMillis();
        System.out.println("用时:" + (end - start) + "ms");
    }
}