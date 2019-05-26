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
 * @Date: 2019-05-20 20:34
 * 选择排序
 * 平均时间复杂度  最好情况  最坏情况  空间复杂度  排序方式    稳定性
 *   O(n^2)     O(n^2)    O(n^2)    O(1)    In-place    false
 */
public class SelectSort {

    public static int[] selectSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            RandomIntArray.swap(arr, min, i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = RandomIntArray.getArray(0, 1000, 200);
        RandomIntArray.display(arr);
        SelectSort.selectSort(arr);
        RandomIntArray.display(arr);
    }
}
