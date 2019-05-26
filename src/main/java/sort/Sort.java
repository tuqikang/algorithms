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
 */
public interface Sort {

    void sort(int[] arr);

    default long action(int[] arr) {
        long start = System.currentTimeMillis();
        sort(arr);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
