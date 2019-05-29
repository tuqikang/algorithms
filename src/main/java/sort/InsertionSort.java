package sort;

/**
 * ___________ ________     ____  __.
 * \__    ___/ \_____  \   |    |/ _|
 * |    |     /  / \  \  |      <
 * |    |    /   \_/.  \ |    |  \
 * |____|    \_____\ \_/ |____|__ \
 *
 * @Author: tuqikang
 * @Date: 2019-05-17 19:32
 * 平均时间复杂度  最好情况  最坏情况  空间复杂度  排序方式    稳定性
 * O(n^2)       O(n)    O(n^2)    O(1)    In-place    true
 */
public class InsertionSort implements Sort {

    @Override
    public void sort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        int j;
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            for (j = i; j > 0 && arr[j - 1] > temp; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = temp;
        }
    }

}
