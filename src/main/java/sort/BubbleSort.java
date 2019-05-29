package sort;

import utils.ArrayUtils;

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
public class BubbleSort implements Sort {

//    public static int[] sort(int[] arr) {
//        for (int i = arr.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    ArrayUtils.swap(arr, j, j + 1);
//                }
//            }
//        }
//        return arr;
//    }

    @Override
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            boolean b = true;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    ArrayUtils.swap(arr, j, j + 1);
                    b = false;
                }
            }
            if (b) {
                break;
            }
        }
    }

}
