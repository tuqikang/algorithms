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
public class RandomIntArray {

    /**
     * [start,end) size个int类型的数组
     * @param start
     * @param end
     * @param size
     * @return
     */
    public static int[] getArray(int start, int end, int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=start+random.nextInt(end);
        }
        return arr;
    }

    /**
     * 显示
     * @param arr
     */
    public static void display(int[] arr){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(",");
        }
        String str = sb.substring(0,sb.length()-1);
        str = str+"]";
        System.out.println(str);
    }

    public static void main(String[] args) {
        int[] ints = RandomIntArray.getArray(0,20,100);
        RandomIntArray.display(ints);
    }
}
