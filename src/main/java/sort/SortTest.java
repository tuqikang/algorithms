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
 * @Date: 2019-05-26 22:22
 */
public class SortTest {

    public static void main(String[] args) {
        int[] arr = RandomIntArray.getArraySorted(0, 100000, 10000);
        RandomIntArray.display(arr);
//        Sort sort = new BubbleSort();
//        Sort sort = new SelectSort();
        Sort sort = new InsertionSort();
        long time = sort.action(arr);
        RandomIntArray.display(arr);
        System.out.println("耗时：" + time + "ms");
    }
}
