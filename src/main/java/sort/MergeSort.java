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
 * @Date: 2019-05-27 16:08
 * 归并排序
 * 平均时间复杂度  最好情况    最坏情况    空间复杂度  排序方式      稳定性
 * O(nlogn)     O(nlogn)   O(nlogn)     O(n)    Out-place    true
 */
public class MergeSort implements Sort {

    @Override
    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    void mergeSort(int[] arr, int left, int right) {
        if (left == right) {
            return;
        }
        int middle = (left + right) / 2;

        //分成左右两部分
        mergeSort(arr, left, middle);
        mergeSort(arr, middle + 1, right);
        //如果右边比左边小就需要合并，不然不需要
        if (arr[middle] > arr[middle + 1]) {
            merge(arr, left, middle + 1, right);
        }
    }

    void merge(int[] arr, int left, int middle, int right) {
        int[] flag = new int[right - left + 1];
        System.arraycopy(arr, left, flag, 0, right - left + 1);
        int l = left;
        int m = middle;
        int index = left;
        while (l < middle && m <= right) {
            if (flag[l - left] < flag[m - left]) {
                arr[index] = flag[l - left];
                l++;
            } else {
                arr[index] = flag[m - left];
                m++;
            }
            index++;
        }
        while (l < middle) {
            arr[index] = flag[l - left];
            l++;
            index++;
        }
        while (m <= right) {
            arr[index] = flag[m - left];
            m++;
            index++;
        }
        flag = null;
    }

}
