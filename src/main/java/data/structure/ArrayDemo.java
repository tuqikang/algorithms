package data.structure;

import java.util.ArrayList;

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
 * @date ：Created in 2019-06-11 20:01
 * @description 数组是一种线性表数据结构。连续内存空间，用来存储具有相同类型的数据。
 * 链表、队列、栈也是线性表结构，只有前后两个方向
 * 非线性表：二叉树，堆，图等
 * @modified By：
 * @version:
 */
public class ArrayDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(arrayList.hashCode());
        System.out.println(args.hashCode());
        int index = args.hashCode();
        int i2 = index>>>16;
        System.out.println(i2);
        System.out.println(index^i2);

        //数组对于插入操作的优化：将第K位的数据放入数组元素最后，把新元素放入k位置

        //插入操作优化：先记录下已经删除的数据。每次的删除操作并不是真正地搬移数据，
        // 只是记录数据已经被删除。当数组没有更多空间存储数据时，我们再触发执行一次真正的删除操作，这样就大大减少了操作导致的数据搬移。

    }
}
