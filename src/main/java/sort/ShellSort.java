package sort;

/**
 * ___________ ________     ____  __.
 * \__    ___/ \_____  \   |    |/ _|
 * |    |     /  / \  \  |      <
 * |    |    /   \_/.  \ |    |  \
 * |____|    \_____\ \_/ |____|__ \
 *
 * @Author: tuqikang
 * @Date: 2019-05-26 22:15
 * 平均时间复杂度   最好情况       最坏情况    空间复杂度  排序方式    稳定性
 * O(nlogn)     O(nlog^2n)    O(nlog^2n)    O(1)    In-place    false
 */
public class ShellSort implements Sort {
    @Override
    public void sort(int[] arr) {
        //增量每次都/2,直到增量为1
        for (int step = arr.length / 2; step > 0; step /= 2) {

            //从增量那组开始进行插入排序，直至完毕
            for (int i = step; i < arr.length; i++) {

                int j = i;
                int temp = arr[j];

                // j - step 就是代表与它同组隔壁的元素
                while (j - step >= 0 && arr[j - step] > temp) {
                    arr[j] = arr[j - step];
                    j = j - step;
                }
                arr[j] = temp;
            }
        }
    }
}
