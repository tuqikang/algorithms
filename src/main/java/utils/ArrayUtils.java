package utils;

import java.util.Random;

/**
 * ___________ ________     ____  __.
 * \__    ___/ \_____  \   |    |/ _|
 * |    |     /  / \  \  |      <
 * |    |    /   \_/.  \ |    |  \
 * |____|    \_____\ \_/ |____|__ \
 *
 * @Author: tuqikang
 * @Date: 2019-05-17 19:37
 */
public class ArrayUtils {

    /**
     * [start,end) size个int类型的数组
     *
     * @param start
     * @param end
     * @param size
     * @return
     */
    public static int[] getArray(int start, int end, int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = start + random.nextInt(end);
        }
        return arr;
    }

    /**
     * 一个几乎有序的数组
     *
     * @param start
     * @param end
     * @param size
     * @return
     */
    public static int[] getArraySorted(int start, int end, int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < 10; i++) {
            swap(arr, random.nextInt(size), random.nextInt(size));
        }
        return arr;
    }

    /**
     * 交换数组上两个位置的值
     *
     * @param arr
     * @param var1
     * @param var2
     */
    public static void swap(int[] arr, int var1, int var2) {
        int temp = arr[var1];
        arr[var1] = arr[var2];
        arr[var2] = temp;
    }

    /**
     * 显示
     *
     * @param arr
     */
    public static void display(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(",");
        }
        String str = sb.substring(0, sb.length() - 1);
        str = str + "]";
        System.out.println(str);
    }

    /**
     * 二分法查找
     *
     * @param arr
     * @param value
     * @return
     */
    public static int dichotomy(int[] arr, int value) {
        int start = 0, end = arr.length - 1;
        int center;
        while (start - end < 1) {
            center = start + ((end - start) >>> 1);
            if (arr[center] == value) {
                return center;
            } else if (arr[center] < value) {
                start = center + 1;
            } else {
                end = center - 1;
            }
        }
        return -1;
    }

}
