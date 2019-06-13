package data.structure.heap;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

/**
 * █████▒█      ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * ░     ░░▒░ ░ ░   ░  ▒   ░ ░▒ ▒░
 * ░ ░    ░░░ ░ ░ ░        ░ ░░ ░
 * ░     ░ ░      ░  ░
 *
 * @author ：涂齐康
 * @date ：Created in 2019-06-13 21:36
 * @description：最小堆
 * @modified By：
 * @version:
 */
public class MinHeap<E extends Comparable<E>> {

    private List<E> data;

    public MinHeap(int capacity) {
        data = new ArrayList<>(capacity);
    }

    public MinHeap() {
        data = new ArrayList<>();
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * 返回父节点索引
     *
     * @param index
     * @return
     */
    private int parent(int index) {
        return (index - 1) / 2;
    }

    /**
     * 返回左孩子索引
     *
     * @param index
     * @return
     */
    private int leftChild(int index) {
        return index * 2 + 1;
    }

    /**
     * 返回右孩子索引
     *
     * @param index
     * @return
     */
    private int rightChild(int index) {
        return index * 2 + 2;
    }

    /**
     * 添加元素
     *
     * @param e
     */
    public void add(E e) {
        //新元素放入数组最后
        data.add(data.size(), e);
        siftUp(data.size() - 1);
    }

    /**
     * 位置index的元素位置上浮
     *
     * @param index
     */
    private void siftUp(int index) {
        while (index > 0 && data.get(index).compareTo(data.get(parent(index))) < 0) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    public E findMin() {
        return data.get(0);
    }

    public E pop() {
        E e = findMin();
        swap(0, data.size() - 1);
        data.remove(data.size() - 1);
        siftDown(0);
        return e;
    }

    /**
     * index位置元素下沉
     *
     * @param index
     */
    private void siftDown(int index) {
        while (leftChild(index) < data.size()) {
            int j = leftChild(index);
            //获取左右的最小值
            if (j + 1 < data.size() && data.get(j + 1).compareTo(data.get(j)) < 0) {
                j++;
            }
            if (data.get(index).compareTo(data.get(j)) < 0) {
                break;
            }
            swap(index, j);
            index = j;
        }
    }

    private void swap(int i, int j) {
        if (i < 0 || i >= data.size() || j < 0 || j >= data.size()) {
            throw new ArrayIndexOutOfBoundsException("index is illegal.");
        }
        E var1 = data.get(i);
        E var2 = data.get(j);
        data.set(i, var2);
        data.set(j, var1);
    }

    public void display() {

        for (E e : data) {
            System.out.print(e);
        }
    }
}
