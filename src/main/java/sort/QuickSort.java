package sort;

import utils.ArrayUtils;

import java.util.Random;

/**
 * ___________ ________     ____  __.
 * \__    ___/ \_____  \   |    |/ _|
 * |    |     /  / \  \  |      <
 * |    |    /   \_/.  \ |    |  \
 * |____|    \_____\ \_/ |____|__ \
 *
 * @Author: tuqikang
 * @Date: 2019-05-29 09:59
 */
public class QuickSort implements Sort {
    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int index = quick(arr, left, right);
            quickSort(arr, left, index);
            quickSort(arr, index + 1, right);
        }
    }

    private int quick(int[] arr, int left, int right) {
        Random random = new Random();
        int swap = random.nextInt(right - left) + left;
        ArrayUtils.swap(arr, left, swap);
        int temp = arr[left];
        int l = left + 1;
        int r = right;
        while (l <= right) {
            while (temp > arr[l] && l < right) {
                l++;
            }
            while (temp <= arr[r] && r > left) {
                r--;
            }
            if (l > r) {
                break;
            }
            ArrayUtils.swap(arr, l, r);
        }
        ArrayUtils.swap(arr, left, r);
        return r;
    }
}
