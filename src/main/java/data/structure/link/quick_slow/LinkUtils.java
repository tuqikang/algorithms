package data.structure.link.quick_slow;

import java.util.Random;

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
 * @date ：Created in 2019-06-18 14:34
 * @description：
 * @modified By：
 * @version:
 */
public class LinkUtils {

    public static Node<Integer> getNonCircle() {
        Random random = new Random();
        int flag = random.nextInt(20) + 10;
        Node<Integer> node = new Node<>(0);
        Node head = node;
        for (int i = 1; i < flag; i++) {
            node.next = new Node<>(i);
            node = node.next;
        }
        return head;
    }

    public static Node<Integer> getCircle() {
        Random random = new Random();
        int flag = 10 + random.nextInt(20);
        System.out.println("生成" + flag + "个节点的链表");
        Node<Integer> node = new Node<>(0);
        Node head = node;
        Node entry = null;
        int index = 1 + random.nextInt(flag - 1);
        for (int i = 1; i < flag; i++) {
            node.next = new Node<>(i);
            if (i == index) {
                entry = node;
            }
            node = node.next;
        }
        System.out.println("链环切入点的值为" + entry.e);
        node.next = entry;
        return head;
    }
}
