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

    /**
     * 二分法查找
     * @param arr
     * @param value
     * @return
     */
    public static int dichotomy(int[] arr,int value){
        int start = 0,end=arr.length-1;
        int center,index=-1;
        while (start-end<1){
            center=(start+end)/2;
            if (arr[center]==value){
                return center;
            }else if (arr[center]<value){
                start=center+1;
            }else {
                end=center-1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] ints = RandomIntArray.getArray(0,20,100);
        RandomIntArray.display(ints);
    }
}
