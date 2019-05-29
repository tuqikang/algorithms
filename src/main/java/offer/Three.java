package offer;

import utils.ArrayUtils;

/**
 * ___________ ________     ____  __.
 * \__    ___/ \_____  \   |    |/ _|
 * |    |     /  / \  \  |      <
 * |    |    /   \_/.  \ |    |  \
 * |____|    \_____\ \_/ |____|__ \
 *
 * @Author: tuqikang
 * @Date: 2019-05-19 13:20
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * Input:
 * {2, 3, 1, 0, 2, 5}
 * Output:
 * 2
 */
public class Three {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.getArray(0, 10, 10);
        ArrayUtils.display(arr);
        for (int index = 0; index < arr.length; index++) {
            while (index!=arr[index]){
                if (arr[index]==arr[arr[index]]){
                    System.out.println(arr[index]);
                    return;
                }
                ArrayUtils.swap(arr,index,arr[index]);
            }
        }
        System.out.println("无");

    }
}
